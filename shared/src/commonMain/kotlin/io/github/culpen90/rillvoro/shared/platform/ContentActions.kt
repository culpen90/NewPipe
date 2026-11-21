/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.platform

interface ContentActions {
    val usesSystemAppLanguageSettings: Boolean

    fun systemAppLanguageName(): String?

    fun openSystemAppLanguageSettings()

    fun applyAppLanguage(languageCode: String)

    fun applyImageQuality(quality: String)

    fun applyYoutubeRestrictedMode(enabled: Boolean)

    fun applyContentLocalization()
}
