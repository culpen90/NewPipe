/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.platform

import io.github.culpen90.rillvoro.shared.model.ChannelNotificationCount
import kotlinx.coroutines.flow.Flow

/**
 * Hooks into the notification helpers, worker and database that still live in the current Android app
 */
interface NotificationHost {

    fun areNotificationsEnabledOnDevice(): Boolean

    fun applyNewStreamsNotificationsEnabled()

    fun applyNewStreamsCheckSchedule()

    fun channelNotificationCounts(): Flow<ChannelNotificationCount>

    fun recreatePlayerNotification()
}
