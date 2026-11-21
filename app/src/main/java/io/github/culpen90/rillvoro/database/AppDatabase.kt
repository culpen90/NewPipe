/*
 * SPDX-FileCopyrightText: 2017-2024 NewPipe contributors <https://newpipe.net>
 * SPDX-FileCopyrightText: 2025 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.database

import androidx.room3.ColumnTypeConverters
import androidx.room3.Database
import androidx.room3.RoomDatabase
import io.github.culpen90.rillvoro.database.feed.dao.FeedDAO
import io.github.culpen90.rillvoro.database.feed.dao.FeedGroupDAO
import io.github.culpen90.rillvoro.database.feed.model.FeedEntity
import io.github.culpen90.rillvoro.database.feed.model.FeedGroupEntity
import io.github.culpen90.rillvoro.database.feed.model.FeedGroupSubscriptionEntity
import io.github.culpen90.rillvoro.database.feed.model.FeedLastUpdatedEntity
import io.github.culpen90.rillvoro.database.history.dao.SearchHistoryDAO
import io.github.culpen90.rillvoro.database.history.dao.StreamHistoryDAO
import io.github.culpen90.rillvoro.database.history.model.SearchHistoryEntry
import io.github.culpen90.rillvoro.database.history.model.StreamHistoryEntity
import io.github.culpen90.rillvoro.database.playlist.dao.PlaylistDAO
import io.github.culpen90.rillvoro.database.playlist.dao.PlaylistRemoteDAO
import io.github.culpen90.rillvoro.database.playlist.dao.PlaylistStreamDAO
import io.github.culpen90.rillvoro.database.playlist.model.PlaylistEntity
import io.github.culpen90.rillvoro.database.playlist.model.PlaylistRemoteEntity
import io.github.culpen90.rillvoro.database.playlist.model.PlaylistStreamEntity
import io.github.culpen90.rillvoro.database.stream.dao.StreamDAO
import io.github.culpen90.rillvoro.database.stream.dao.StreamStateDAO
import io.github.culpen90.rillvoro.database.stream.model.StreamEntity
import io.github.culpen90.rillvoro.database.stream.model.StreamStateEntity
import io.github.culpen90.rillvoro.database.subscription.SubscriptionDAO
import io.github.culpen90.rillvoro.database.subscription.SubscriptionEntity

@ColumnTypeConverters(Converters::class)
@Database(
    version = Migrations.DB_VER_9,
    entities = [
        SubscriptionEntity::class,
        SearchHistoryEntry::class,
        StreamEntity::class,
        StreamHistoryEntity::class,
        StreamStateEntity::class,
        PlaylistEntity::class,
        PlaylistStreamEntity::class,
        PlaylistRemoteEntity::class,
        FeedEntity::class,
        FeedGroupEntity::class,
        FeedGroupSubscriptionEntity::class,
        FeedLastUpdatedEntity::class
    ]
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun feedDAO(): FeedDAO
    abstract fun feedGroupDAO(): FeedGroupDAO
    abstract fun playlistDAO(): PlaylistDAO
    abstract fun playlistRemoteDAO(): PlaylistRemoteDAO
    abstract fun playlistStreamDAO(): PlaylistStreamDAO
    abstract fun searchHistoryDAO(): SearchHistoryDAO
    abstract fun streamDAO(): StreamDAO
    abstract fun streamHistoryDAO(): StreamHistoryDAO
    abstract fun streamStateDAO(): StreamStateDAO
    abstract fun subscriptionDAO(): SubscriptionDAO

    companion object {
        const val DATABASE_NAME: String = "rillvoro.db"
    }
}
