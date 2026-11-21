/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.screen.about.navigation

import org.jetbrains.compose.resources.StringResource
import rillvoro.shared.generated.resources.Res
import rillvoro.shared.generated.resources.tab_about
import rillvoro.shared.generated.resources.tab_licenses

/**
 * Possible pages to show in about screen
 */
enum class Page(val localizedTitle: StringResource) {
    ABOUT(Res.string.tab_about),
    LICENSE(Res.string.tab_licenses)
}
