/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.platform

import io.github.culpen90.rillvoro.shared.model.ChannelNotificationCount
import kotlinx.coroutines.flow.Flow

/**
 * Platform-specific actions triggered from the Notifications settings screen
 */
interface NotificationActions {

    val isPlayerNotificationExempt: Boolean

    val hasSystemMediaControls: Boolean

    fun areNotificationsEnabledOnDevice(): Boolean

    fun openSystemNotificationSettings()

    fun applyNewStreamsNotificationsEnabled()

    fun applyNewStreamsCheckSchedule()

    fun channelNotificationCounts(): Flow<ChannelNotificationCount>

    fun recreatePlayerNotification()
}
