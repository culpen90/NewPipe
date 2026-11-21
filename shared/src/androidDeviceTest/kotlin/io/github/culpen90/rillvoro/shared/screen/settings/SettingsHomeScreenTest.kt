/*
* SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
* SPDX-License-Identifier: GPL-3.0-or-later
*/

package io.github.culpen90.rillvoro.shared.screen.settings

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.v2.runComposeUiTest
import com.russhwolf.settings.MapSettings
import com.russhwolf.settings.Settings
import io.github.culpen90.rillvoro.shared.extensions.withKoin
import io.github.culpen90.rillvoro.shared.screen.settings.model.SettingsCategory
import kotlin.test.Test
import kotlin.test.assertTrue
import org.jetbrains.compose.resources.getString
import org.koin.dsl.module
import rillvoro.shared.generated.resources.Res
import rillvoro.shared.generated.resources.ic_headset
import rillvoro.shared.generated.resources.settings
import rillvoro.shared.generated.resources.settings_category_video_audio_title

@OptIn(ExperimentalTestApi::class)
class SettingsHomeScreenTest {

    private val emptySettings = module {
        single<Settings> { MapSettings() }
    }

    @Test
    fun testTitleAndCategoriesRender() = runComposeUiTest {
        withKoin(
            modules = listOf(emptySettings),
            content = { SettingsHomeScreenContent() },
            onContent = {
                onNodeWithText(getString(Res.string.settings)).assertIsDisplayed()
                onNodeWithText(getString(Res.string.settings_category_video_audio_title))
                    .assertIsDisplayed()
            }
        )
    }

    @Test
    fun testCategoryClickFires() = runComposeUiTest {
        var clicked = false
        val categories = listOf(
            SettingsCategory(
                title = Res.string.settings_category_video_audio_title,
                icon = Res.drawable.ic_headset,
                onClick = { clicked = true }
            )
        )
        withKoin(
            modules = listOf(emptySettings),
            content = { SettingsHomeScreenContent(categories = categories) },
            onContent = {
                onNodeWithText(getString(Res.string.settings_category_video_audio_title))
                    .performClick()
                assertTrue(clicked)
            }
        )
    }
}
