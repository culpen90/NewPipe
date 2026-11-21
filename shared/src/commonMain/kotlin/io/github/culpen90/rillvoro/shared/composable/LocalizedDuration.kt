/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.composable

import androidx.compose.runtime.Composable
import kotlin.time.Duration
import kotlin.time.Duration.Companion.days
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes
import org.jetbrains.compose.resources.pluralStringResource
import rillvoro.shared.generated.resources.Res
import rillvoro.shared.generated.resources.days
import rillvoro.shared.generated.resources.hours
import rillvoro.shared.generated.resources.minutes
import rillvoro.shared.generated.resources.seconds

/**
 * Names a duration by its largest whole unit, e.g. "4 hours", as the old DurationListPreference did
 */
@Composable
fun localizedDuration(duration: Duration): String = when {
    duration >= 1.days -> {
        val days = duration.inWholeDays.toInt()
        pluralStringResource(Res.plurals.days, days, days)
    }

    duration >= 1.hours -> {
        val hours = duration.inWholeHours.toInt()
        pluralStringResource(Res.plurals.hours, hours, hours)
    }

    duration >= 1.minutes -> {
        val minutes = duration.inWholeMinutes.toInt()
        pluralStringResource(Res.plurals.minutes, minutes, minutes)
    }

    else -> {
        val seconds = duration.inWholeSeconds.toInt()
        pluralStringResource(Res.plurals.seconds, seconds, seconds)
    }
}
