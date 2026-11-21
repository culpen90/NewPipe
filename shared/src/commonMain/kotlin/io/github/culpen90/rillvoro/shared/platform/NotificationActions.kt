/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.platform

import co.touchlab.kermit.Logger
import io.github.culpen90.rillvoro.shared.model.ChannelNotificationCount
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

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

internal object NoOpNotificationActions : NotificationActions {

    override val isPlayerNotificationExempt = false

    override val hasSystemMediaControls = false

    override fun areNotificationsEnabledOnDevice() = true

    override fun openSystemNotificationSettings() = logUnsupported("openSystemNotificationSettings")

    override fun applyNewStreamsNotificationsEnabled() = logUnsupported("applyNewStreamsNotificationsEnabled")

    override fun applyNewStreamsCheckSchedule() = logUnsupported("applyNewStreamsCheckSchedule")

    override fun channelNotificationCounts(): Flow<ChannelNotificationCount> = emptyFlow()

    override fun recreatePlayerNotification() = logUnsupported("recreatePlayerNotification")

    private fun logUnsupported(action: String) = Logger.w(messageString = "Notification action '$action' is unsupported on this platform")
}
