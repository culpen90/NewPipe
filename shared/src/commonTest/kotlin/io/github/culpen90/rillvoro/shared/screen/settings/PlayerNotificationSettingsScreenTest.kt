/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.screen.settings

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertCountEquals
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.isToggleable
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performScrollTo
import androidx.compose.ui.test.v2.runComposeUiTest
import io.github.culpen90.rillvoro.shared.extensions.onToggleableNodeNextTo
import io.github.culpen90.rillvoro.shared.extensions.settingsModule
import io.github.culpen90.rillvoro.shared.extensions.withKoin
import io.github.culpen90.rillvoro.shared.model.NotificationAction
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull
import org.jetbrains.compose.resources.getString
import rillvoro.shared.generated.resources.Res
import rillvoro.shared.generated.resources.notification_action_0_title
import rillvoro.shared.generated.resources.notification_action_3_title
import rillvoro.shared.generated.resources.notification_action_4_title
import rillvoro.shared.generated.resources.notification_action_shuffle
import rillvoro.shared.generated.resources.notification_actions_at_most_three

@OptIn(ExperimentalTestApi::class)
class PlayerNotificationSettingsScreenTest {

    @Test
    fun aFourthCompactSlotIsRejectedWithAWarning() = runComposeUiTest {
        var toggledSlot: Int? = null
        withKoin(
            modules = listOf(settingsModule()),
            content = { PlayerNotificationSettingsScreenContent(onCompactSlotToggle = { slot -> toggledSlot = slot }) },
            onContent = {
                onToggleableNodeNextTo(getString(Res.string.notification_action_3_title)).performScrollTo().performClick()
                waitForIdle()
                onNodeWithText(getString(Res.string.notification_actions_at_most_three)).assertIsDisplayed()
                assertNull(toggledSlot)
            }
        )
    }

    @Test
    fun uncheckingACompactSlotIsReported() = runComposeUiTest {
        var toggledSlot: Int? = null
        withKoin(
            modules = listOf(settingsModule()),
            content = { PlayerNotificationSettingsScreenContent(onCompactSlotToggle = { slot -> toggledSlot = slot }) },
            onContent = {
                onToggleableNodeNextTo(getString(Res.string.notification_action_0_title)).performScrollTo().performClick()
                assertEquals(0, toggledSlot)
            }
        )
    }

    @Test
    fun systemMediaControlsHideTheFixedSlotsAndCheckboxes() = runComposeUiTest {
        withKoin(
            modules = listOf(settingsModule()),
            content = { PlayerNotificationSettingsScreenContent(hasSystemMediaControls = true) },
            onContent = {
                onNodeWithText(getString(Res.string.notification_action_0_title)).assertDoesNotExist()
                onNodeWithText(getString(Res.string.notification_action_3_title)).assertExists()
                onAllNodes(isToggleable()).assertCountEquals(3)
            }
        )
    }

    @Test
    fun choosingAnActionReportsItsSlot() = runComposeUiTest {
        var change: Pair<Int, NotificationAction>? = null
        withKoin(
            modules = listOf(settingsModule()),
            content = {
                PlayerNotificationSettingsScreenContent(onSlotActionChange = { slot, action -> change = slot to action })
            },
            onContent = {
                onNodeWithText(getString(Res.string.notification_action_4_title)).performScrollTo().performClick()
                onNodeWithText(getString(Res.string.notification_action_shuffle)).performClick()
                assertEquals(4 to NotificationAction.SHUFFLE, change)
            }
        )
    }
}
