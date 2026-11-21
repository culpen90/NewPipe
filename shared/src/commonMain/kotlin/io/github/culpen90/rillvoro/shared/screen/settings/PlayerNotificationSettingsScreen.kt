/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.screen.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewWrapper
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import io.github.culpen90.rillvoro.shared.composable.NotificationActionSlot
import io.github.culpen90.rillvoro.shared.composable.SwitchPreference
import io.github.culpen90.rillvoro.shared.composable.TopAppBar
import io.github.culpen90.rillvoro.shared.model.NotificationAction
import io.github.culpen90.rillvoro.shared.navigation.Navigator
import io.github.culpen90.rillvoro.shared.platform.NotificationActions
import io.github.culpen90.rillvoro.shared.preferences.PlayerNotificationPreferences.DEFAULT_COLORIZE
import io.github.culpen90.rillvoro.shared.preferences.PlayerNotificationPreferences.DEFAULT_COMPACT_SLOTS
import io.github.culpen90.rillvoro.shared.preferences.PlayerNotificationPreferences.DEFAULT_SCALE_TO_SQUARE_IMAGE
import io.github.culpen90.rillvoro.shared.preferences.PlayerNotificationPreferences.DEFAULT_SHOW_THUMBNAIL
import io.github.culpen90.rillvoro.shared.preferences.PlayerNotificationPreferences.DEFAULT_SLOT_ACTIONS
import io.github.culpen90.rillvoro.shared.preferences.PlayerNotificationPreferences.MAX_COMPACT_SLOTS
import io.github.culpen90.rillvoro.shared.preferences.PlayerNotificationPreferences.SLOT_COUNT
import io.github.culpen90.rillvoro.shared.preview.ThemePreviewProvider
import io.github.culpen90.rillvoro.shared.viewmodel.settings.PlayerNotificationSettingsViewModel
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.koinInject
import org.koin.compose.viewmodel.koinViewModel
import rillvoro.shared.generated.resources.Res
import rillvoro.shared.generated.resources.notification_action_0_title
import rillvoro.shared.generated.resources.notification_action_1_title
import rillvoro.shared.generated.resources.notification_action_2_title
import rillvoro.shared.generated.resources.notification_action_3_title
import rillvoro.shared.generated.resources.notification_action_4_title
import rillvoro.shared.generated.resources.notification_actions_at_most_three
import rillvoro.shared.generated.resources.notification_actions_summary
import rillvoro.shared.generated.resources.notification_actions_summary_android13
import rillvoro.shared.generated.resources.notification_colorize_summary
import rillvoro.shared.generated.resources.notification_colorize_title
import rillvoro.shared.generated.resources.notification_scale_to_square_image_summary
import rillvoro.shared.generated.resources.notification_scale_to_square_image_title
import rillvoro.shared.generated.resources.settings_category_player_notification_title
import rillvoro.shared.generated.resources.show_thumbnail_summary
import rillvoro.shared.generated.resources.show_thumbnail_title

private val SLOT_TITLES = listOf(
    Res.string.notification_action_0_title,
    Res.string.notification_action_1_title,
    Res.string.notification_action_2_title,
    Res.string.notification_action_3_title,
    Res.string.notification_action_4_title
)

// Play/pause, previous and next, which the system places in the first slots itself
private const val SYSTEM_MEDIA_CONTROL_SLOTS = 3

@Composable
fun PlayerNotificationSettingsScreen(
    navigator: Navigator = koinInject(),
    viewModel: PlayerNotificationSettingsViewModel = koinViewModel(),
    notificationActions: NotificationActions = koinInject()
) {
    val scaleToSquareImage by viewModel.scaleToSquareImage.collectAsStateWithLifecycle()
    val colorize by viewModel.colorize.collectAsStateWithLifecycle()
    val showThumbnail by viewModel.showThumbnail.collectAsStateWithLifecycle()
    val slotActions by viewModel.slotActions.collectAsStateWithLifecycle()
    val compactSlots by viewModel.compactSlots.collectAsStateWithLifecycle()

    PlayerNotificationSettingsScreenContent(
        scaleToSquareImage = scaleToSquareImage,
        colorize = colorize,
        showThumbnail = showThumbnail,
        slotActions = slotActions,
        compactSlots = compactSlots,
        hasSystemMediaControls = notificationActions.hasSystemMediaControls,
        onScaleToSquareImageChange = viewModel::setScaleToSquareImage,
        onColorizeChange = viewModel::setColorize,
        onShowThumbnailChange = viewModel::setShowThumbnail,
        onSlotActionChange = viewModel::setSlotAction,
        onCompactSlotToggle = viewModel::toggleCompactSlot,
        onNavigateUp = { navigator.navigateUp() }
    )
}

@Composable
fun PlayerNotificationSettingsScreenContent(
    scaleToSquareImage: Boolean = DEFAULT_SCALE_TO_SQUARE_IMAGE,
    colorize: Boolean = DEFAULT_COLORIZE,
    showThumbnail: Boolean = DEFAULT_SHOW_THUMBNAIL,
    slotActions: List<NotificationAction> = DEFAULT_SLOT_ACTIONS,
    compactSlots: Set<Int> = DEFAULT_COMPACT_SLOTS,
    hasSystemMediaControls: Boolean = false,
    onScaleToSquareImageChange: (Boolean) -> Unit = {},
    onColorizeChange: (Boolean) -> Unit = {},
    onShowThumbnailChange: (Boolean) -> Unit = {},
    onSlotActionChange: (slot: Int, action: NotificationAction) -> Unit = { _, _ -> },
    onCompactSlotToggle: (slot: Int) -> Unit = {},
    onNavigateUp: () -> Unit = {}
) {
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    val atMostThreeText = stringResource(Res.string.notification_actions_at_most_three)
    val firstEditableSlot = if (hasSystemMediaControls) SYSTEM_MEDIA_CONTROL_SLOTS else 0
    val actionsSummary = if (hasSystemMediaControls) {
        Res.string.notification_actions_summary_android13
    } else {
        Res.string.notification_actions_summary
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = stringResource(Res.string.settings_category_player_notification_title),
                onNavigateUp = onNavigateUp
            )
        },
        snackbarHost = { SnackbarHost(snackbarHostState) }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = paddingValues.calculateTopPadding())
                .verticalScroll(rememberScrollState())
                .padding(WindowInsets.navigationBars.asPaddingValues())
        ) {
            SwitchPreference(
                title = stringResource(Res.string.notification_scale_to_square_image_title),
                summary = stringResource(Res.string.notification_scale_to_square_image_summary),
                checked = scaleToSquareImage,
                onCheckedChange = onScaleToSquareImageChange
            )
            SwitchPreference(
                title = stringResource(Res.string.notification_colorize_title),
                summary = stringResource(Res.string.notification_colorize_summary),
                checked = colorize,
                onCheckedChange = onColorizeChange
            )
            SwitchPreference(
                title = stringResource(Res.string.show_thumbnail_title),
                summary = stringResource(Res.string.show_thumbnail_summary),
                checked = showThumbnail,
                onCheckedChange = onShowThumbnailChange
            )
            HorizontalDivider(modifier = Modifier.padding(top = 8.dp))
            Text(
                text = stringResource(actionsSummary),
                modifier = Modifier.padding(16.dp),
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                style = MaterialTheme.typography.bodyMedium
            )
            for (slot in firstEditableSlot until SLOT_COUNT) {
                NotificationActionSlot(
                    title = stringResource(SLOT_TITLES[slot]),
                    action = slotActions[slot],
                    onActionChange = { action -> onSlotActionChange(slot, action) },
                    compact = (slot in compactSlots).takeUnless { hasSystemMediaControls },
                    onCompactToggle = {
                        if (slot !in compactSlots && compactSlots.size >= MAX_COMPACT_SLOTS) {
                            scope.launch { snackbarHostState.showSnackbar(atMostThreeText) }
                        } else {
                            onCompactSlotToggle(slot)
                        }
                    }
                )
            }
        }
    }
}

@PreviewWrapper(ThemePreviewProvider::class)
@PreviewLightDark
@Composable
private fun PlayerNotificationSettingsScreenPreview() {
    PlayerNotificationSettingsScreenContent()
}
