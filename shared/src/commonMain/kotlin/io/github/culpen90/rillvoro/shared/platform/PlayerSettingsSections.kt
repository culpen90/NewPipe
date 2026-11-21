/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.platform

import androidx.compose.runtime.Composable

/**
 * Supplies ExoPlayer settings for the player settings screen.
 */
interface PlayerSettingsSections {
    val isAvailable: Boolean

    @Composable
    fun Render()
}
