package io.github.culpen90.rillvoro.database

import androidx.room3.ColumnTypeConverter
import io.github.culpen90.rillvoro.local.subscription.FeedGroupIcon
import java.time.Instant
import java.time.OffsetDateTime
import java.time.ZoneOffset
import org.schabi.newpipe.extractor.stream.StreamType

class Converters {
    /**
     * Convert a long value to a [OffsetDateTime].
     *
     * @param value the long value
     * @return the `OffsetDateTime`
     */
    @ColumnTypeConverter
    fun offsetDateTimeFromTimestamp(value: Long?): OffsetDateTime? {
        return value?.let { OffsetDateTime.ofInstant(Instant.ofEpochMilli(it), ZoneOffset.UTC) }
    }

    /**
     * Convert a [OffsetDateTime] to a long value.
     *
     * @param offsetDateTime the `OffsetDateTime`
     * @return the long value
     */
    @ColumnTypeConverter
    fun offsetDateTimeToTimestamp(offsetDateTime: OffsetDateTime?): Long? {
        return offsetDateTime?.withOffsetSameInstant(ZoneOffset.UTC)?.toInstant()?.toEpochMilli()
    }

    @ColumnTypeConverter
    fun streamTypeOf(value: String): StreamType {
        return StreamType.valueOf(value)
    }

    @ColumnTypeConverter
    fun stringOf(streamType: StreamType): String {
        return streamType.name
    }

    @ColumnTypeConverter
    fun integerOf(feedGroupIcon: FeedGroupIcon): Int {
        return feedGroupIcon.id
    }

    @ColumnTypeConverter
    fun feedGroupIconOf(id: Int): FeedGroupIcon {
        return FeedGroupIcon.entries.first { it.id == id }
    }
}
