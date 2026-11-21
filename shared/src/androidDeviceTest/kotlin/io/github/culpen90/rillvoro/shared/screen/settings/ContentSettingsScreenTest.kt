/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.screen.settings

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performScrollTo
import androidx.compose.ui.test.v2.runComposeUiTest
import io.github.culpen90.rillvoro.shared.extensions.settingsModule
import io.github.culpen90.rillvoro.shared.extensions.withKoin
import io.github.culpen90.rillvoro.shared.preferences.ContentPreferences.IMAGE_QUALITY_HIGH
import io.github.culpen90.rillvoro.shared.screen.settings.model.ChannelTab
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull
import kotlin.test.assertTrue
import org.jetbrains.compose.resources.getString
import rillvoro.shared.generated.resources.Res
import rillvoro.shared.generated.resources.channel_tab_videos
import rillvoro.shared.generated.resources.content
import rillvoro.shared.generated.resources.content_language_title
import rillvoro.shared.generated.resources.image_quality_high
import rillvoro.shared.generated.resources.image_quality_summary
import rillvoro.shared.generated.resources.ok
import rillvoro.shared.generated.resources.show_channel_tabs

@OptIn(ExperimentalTestApi::class)
class ContentSettingsScreenTest {

    @Test
    fun rendersTitleAndContentLanguageRow() = runComposeUiTest {
        withKoin(
            modules = listOf(settingsModule()),
            content = { ContentSettingsScreenContent() },
            onContent = {
                onNodeWithText(getString(Res.string.content)).assertIsDisplayed()
                onNodeWithText(getString(Res.string.content_language_title)).assertIsDisplayed()
            }
        )
    }

    @Test
    fun appLanguageRowOpensSystemSettingsWhenTheSystemOwnsIt() = runComposeUiTest {
        var opened = false
        withKoin(
            modules = listOf(settingsModule()),
            content = {
                ContentSettingsScreenContent(
                    usesSystemAppLanguageSettings = true,
                    systemAppLanguageName = "Deutsch",
                    onOpenSystemAppLanguageSettings = { opened = true }
                )
            },
            onContent = {
                onNodeWithText("Deutsch").performClick()
                assertTrue(opened)
            }
        )
    }

    @Test
    fun channelTabsAreOnlySavedOnConfirm() = runComposeUiTest {
        var saved: Set<String>? = null
        withKoin(
            modules = listOf(settingsModule()),
            content = {
                ContentSettingsScreenContent(onChannelTabsChange = { value -> saved = value })
            },
            onContent = {
                onNodeWithText(getString(Res.string.show_channel_tabs))
                    .performScrollTo()
                    .performClick()
                onNodeWithText(getString(Res.string.channel_tab_videos)).performClick()
                assertNull(saved)

                onNodeWithText(getString(Res.string.ok)).performClick()
                assertEquals(ChannelTab.SHOW_KEYS - ChannelTab.VIDEOS.showKey, saved)
            }
        )
    }

    @Test
    fun imageQualitySummaryNamesTheSelectedQuality() = runComposeUiTest {
        withKoin(
            modules = listOf(settingsModule()),
            content = { ContentSettingsScreenContent(imageQuality = IMAGE_QUALITY_HIGH) },
            onContent = {
                val quality = getString(Res.string.image_quality_high)
                onNodeWithText(getString(Res.string.image_quality_summary, quality))
                    .performScrollTo()
                    .assertIsDisplayed()
            }
        )
    }
}
