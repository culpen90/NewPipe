/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.settings

import android.content.Context
import android.content.Intent
import io.github.culpen90.rillvoro.App
import io.github.culpen90.rillvoro.database.subscription.NotificationMode
import io.github.culpen90.rillvoro.error.ErrorInfo
import io.github.culpen90.rillvoro.error.ErrorUtil
import io.github.culpen90.rillvoro.error.UserAction
import io.github.culpen90.rillvoro.local.feed.notifications.NotificationHelper
import io.github.culpen90.rillvoro.local.feed.notifications.NotificationWorker
import io.github.culpen90.rillvoro.local.feed.notifications.ScheduleOptions
import io.github.culpen90.rillvoro.local.subscription.SubscriptionManager
import io.github.culpen90.rillvoro.player.notification.NotificationConstants
import io.github.culpen90.rillvoro.shared.model.ChannelNotificationCount
import io.github.culpen90.rillvoro.shared.platform.NotificationHost
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.reactive.asFlow

class ComposeNotificationHost(private val context: Context) : NotificationHost {

    override fun areNotificationsEnabledOnDevice() = NotificationHelper.areNotificationsEnabledOnDevice(context)

    override fun applyNewStreamsNotificationsEnabled() {
        if (NotificationHelper.areNewStreamsNotificationsEnabled(context)) {
            NotificationWorker.schedule(context)
        } else {
            NotificationWorker.cancel(context)
        }
    }

    override fun recreatePlayerNotification() = context.sendBroadcast(
        Intent(NotificationConstants.ACTION_RECREATE_NOTIFICATION).setPackage(App.PACKAGE_NAME)
    )

    override fun applyNewStreamsCheckSchedule() = NotificationWorker.schedule(context, ScheduleOptions.from(context), force = true)

    override fun channelNotificationCounts(): Flow<ChannelNotificationCount> = SubscriptionManager(context)
        .subscriptions()
        .asFlow()
        .map { subscriptions ->
            ChannelNotificationCount(
                notified = subscriptions.count { it.notificationMode != NotificationMode.DISABLED },
                total = subscriptions.size
            )
        }
        .catch { error ->
            ErrorUtil.showSnackbar(
                context,
                ErrorInfo(error, UserAction.SUBSCRIPTION_GET, "Get subscriptions list")
            )
        }
}
