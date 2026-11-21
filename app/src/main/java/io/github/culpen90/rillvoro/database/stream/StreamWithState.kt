package io.github.culpen90.rillvoro.database.stream

import androidx.room3.ColumnInfo
import androidx.room3.Embedded
import io.github.culpen90.rillvoro.database.stream.model.StreamEntity
import io.github.culpen90.rillvoro.database.stream.model.StreamStateEntity

data class StreamWithState(
    @Embedded
    val stream: StreamEntity,

    @ColumnInfo(name = StreamStateEntity.STREAM_PROGRESS_MILLIS)
    val stateProgressMillis: Long?
)
