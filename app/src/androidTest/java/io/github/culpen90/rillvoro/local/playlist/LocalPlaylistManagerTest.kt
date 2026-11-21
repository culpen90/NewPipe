package io.github.culpen90.rillvoro.local.playlist

import io.github.culpen90.rillvoro.database.AppDatabase
import io.github.culpen90.rillvoro.database.stream.model.StreamEntity
import io.github.culpen90.rillvoro.testUtil.TestDatabase
import io.github.culpen90.rillvoro.testUtil.TrampolineSchedulerRule
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.schabi.newpipe.extractor.stream.StreamType

class LocalPlaylistManagerTest {

    private lateinit var manager: LocalPlaylistManager
    private lateinit var database: AppDatabase

    @get:Rule
    val trampolineScheduler = TrampolineSchedulerRule()

    @Before
    fun setup() {
        database = TestDatabase.createReplacingRillvoroDatabase()
        manager = LocalPlaylistManager(database)
    }

    @After
    fun cleanUp() {
        database.close()
    }

    @Test
    fun createPlaylist() {
        val TEST_URL = "https://example.org/"
        val stream = StreamEntity(
            serviceId = 1,
            url = TEST_URL,
            title = "title",
            streamType = StreamType.VIDEO_STREAM,
            duration = 1,
            uploader = "uploader",
            uploaderUrl = TEST_URL
        )

        val result = manager.createPlaylist("name", listOf(stream))

        // This should not behave like this.
        // Currently list of all stream ids is returned instead of playlist id
        result.test().await().assertValue(listOf(1L))
    }

    @Test
    fun createPlaylist_emptyPlaylistMustReturnEmpty() {
        val result = manager.createPlaylist("name", emptyList())

        // This should not behave like this.
        // It should throw an error because currently the result is null
        result.test().await().assertComplete()
        manager.getPlaylists().test().awaitCount(1).assertValue(mutableListOf())
    }

    @Test()
    fun createPlaylist_nonExistentStreamsAreUpserted() {
        val stream = StreamEntity(
            serviceId = 1,
            url = "https://example.org/",
            title = "title",
            streamType = StreamType.VIDEO_STREAM,
            duration = 1,
            uploader = "uploader",
            uploaderUrl = "https://example.org/"
        )
        database.streamDAO().insert(stream)
        val upserted = StreamEntity(
            serviceId = 1,
            url = "https://example.org/2",
            title = "title2",
            streamType = StreamType.VIDEO_STREAM,
            duration = 1,
            uploader = "uploader",
            uploaderUrl = "https://example.org/"
        )

        val result = manager.createPlaylist("name", listOf(stream, upserted))

        result.test().await().assertComplete()
        database.streamDAO().getAll().test().awaitCount(1).assertValue(listOf(stream, upserted))
    }
}
