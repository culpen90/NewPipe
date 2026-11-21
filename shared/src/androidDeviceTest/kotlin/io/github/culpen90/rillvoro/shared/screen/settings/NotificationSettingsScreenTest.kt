/*
* SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
* SPDX-License-Identifier: GPL-3.0-or-later
*/

package io.github.culpen90.rillvoro.shared.screen.settings

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsEnabled
import androidx.compose.ui.test.assertIsNotEnabled
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.v2.runComposeUiTest
import io.github.culpen90.rillvoro.shared.extensions.settingsModule
import io.github.culpen90.rillvoro.shared.extensions.withKoin
import io.github.culpen90.rillvoro.shared.model.ChannelNotificationCount
import kotlin.test.Test
import kotlin.test.assertTrue
import org.jetbrains.compose.resources.getPluralString
import org.jetbrains.compose.resources.getString
import rillvoro.shared.generated.resources.Res
import rillvoro.shared.generated.resources.enable_streams_notifications_title
import rillvoro.shared.generated.resources.hours
import rillvoro.shared.generated.resources.settings
import rillvoro.shared.generated.resources.settings_category_player_notification_title
import rillvoro.shared.generated.resources.streams_notifications_interval_title
import rillvoro.shared.generated.resources.wifi_only

@OptIn(ExperimentalTestApi::class)
class NotificationSettingsScreenTest {

    @Test
    fun newStreamsOptionsAreDisabledWhileTheSwitchIsOff() = runComposeUiTest {
        withKoin(
            modules = listOf(settingsModule()),
            content = { NotificationSettingsScreenContent(newStreamsNotificationsEnabled = false) },
            onContent = {
                onNodeWithText(getString(Res.string.streams_notifications_interval_title))
                    .assertIsNotEnabled()
            }
        )
    }

    @Test
    fun channelsSummaryShowsNotifiedOutOfTotal() = runComposeUiTest {
        withKoin(
            modules = listOf(settingsModule()),
            content = {
                NotificationSettingsScreenContent(
                    newStreamsNotificationsEnabled = true,
                    channelNotificationCount = ChannelNotificationCount(notified = 3, total = 5)
                )
            },
            onContent = {
                onNodeWithText("3/5").assertIsDisplayed()
            }
        )
    }

    @Test
    fun disabledDeviceNotificationsOfferTheSystemSettings() = runComposeUiTest {
        var opened = false
        withKoin(
            modules = listOf(settingsModule()),
            content = {
                NotificationSettingsScreenContent(
                    deviceNotificationsEnabled = false,
                    onOpenSystemNotificationSettings = { opened = true }
                )
            },
            onContent = {
                onNodeWithText(getString(Res.string.enable_streams_notifications_title))
                    .assertIsNotEnabled()
                onNodeWithText(getString(Res.string.settings)).performClick()
                waitForIdle()
                assertTrue(opened)
            }
        )
    }

    @Test
    fun playerNotificationStaysEnabledWhenExempt() = runComposeUiTest {
        withKoin(
            modules = listOf(settingsModule()),
            content = {
                NotificationSettingsScreenContent(
                    deviceNotificationsEnabled = false,
                    isPlayerNotificationExempt = true
                )
            },
            onContent = {
                onNodeWithText(getString(Res.string.settings_category_player_notification_title))
                    .assertIsEnabled()
            }
        )
    }

    @Test
    fun defaultSummariesMatchTheLegacyDefaults() = runComposeUiTest {
        withKoin(
            modules = listOf(settingsModule()),
            content = { NotificationSettingsScreenContent() },
            onContent = {
                onNodeWithText(getPluralString(Res.plurals.hours, 4, 4)).assertIsDisplayed()
                onNodeWithText(getString(Res.string.wifi_only)).assertIsDisplayed()
            }
        )
    }
}
