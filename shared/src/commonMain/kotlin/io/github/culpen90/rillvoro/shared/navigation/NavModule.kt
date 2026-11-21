/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.navigation

import androidx.compose.runtime.mutableStateListOf
import co.touchlab.kermit.Logger
import io.github.culpen90.rillvoro.shared.screen.about.AboutScreen
import io.github.culpen90.rillvoro.shared.screen.settings.AppearanceSettingsScreen
import io.github.culpen90.rillvoro.shared.screen.settings.BackupRestoreSettingsScreen
import io.github.culpen90.rillvoro.shared.screen.settings.ContentSettingsScreen
import io.github.culpen90.rillvoro.shared.screen.settings.DebugSettingsScreen
import io.github.culpen90.rillvoro.shared.screen.settings.DownloadSettingsScreen
import io.github.culpen90.rillvoro.shared.screen.settings.HistorySettingsScreen
import io.github.culpen90.rillvoro.shared.screen.settings.NotificationSettingsScreen
import io.github.culpen90.rillvoro.shared.screen.settings.PlayerNotificationSettingsScreen
import io.github.culpen90.rillvoro.shared.screen.settings.PlayerSettingsScreen
import io.github.culpen90.rillvoro.shared.screen.settings.SettingsHomeScreen
import io.github.culpen90.rillvoro.shared.screen.settings.UpdateSettingsScreen
import io.github.culpen90.rillvoro.shared.screen.settings.VideoAudioSettingsScreen
import org.koin.core.annotation.KoinExperimentalAPI
import org.koin.core.annotation.Provided
import org.koin.core.annotation.Singleton
import org.koin.dsl.module
import org.koin.dsl.navigation3.navigation
import org.koin.plugin.module.dsl.single

/**
 * Navigation module to make navigation easier with nav3
 *
 * There is currently no annotation to handle this so we are using DSL API of Koin
 */
@OptIn(KoinExperimentalAPI::class)
fun navModule() = module {
    single<Navigator>()

    navigation<Destination.About> {
        AboutScreen()
    }

    navigation<Destination.Settings> {
        SettingsHomeScreen()
    }

    navigation<Destination.AppearanceSettings> {
        AppearanceSettingsScreen()
    }

    navigation<Destination.VideoAudioSettings> {
        VideoAudioSettingsScreen()
    }

    navigation<Destination.PlayerSettings> {
        PlayerSettingsScreen()
    }

    navigation<Destination.DebugSettings> {
        DebugSettingsScreen()
    }

    navigation<Destination.DownloadSettings> {
        DownloadSettingsScreen()
    }

    navigation<Destination.HistorySettings> {
        HistorySettingsScreen()
    }

    navigation<Destination.ContentSettings> {
        ContentSettingsScreen()
    }

    navigation<Destination.NotificationSettings> {
        NotificationSettingsScreen()
    }

    navigation<Destination.UpdateSettings> {
        UpdateSettingsScreen()
    }

    navigation<Destination.BackupRestoreSettings> {
        BackupRestoreSettingsScreen()
    }

    navigation<Destination.PlayerNotificationSettings> {
        PlayerNotificationSettingsScreen()
    }
}

/**
 * Helper to navigate up and to different destinations in compose
 */
@Singleton
class Navigator(
    @Provided
    private val startDestination: Destination,

    @Provided
    private val onCloseRequest: () -> Unit
) {

    /**
     * Navigation backstack in compose
     */
    val backstack = mutableStateListOf(startDestination)

    /**
     * Navigates to the given destination
     */
    fun navigateTo(destination: Destination) = backstack.add(destination)

    /**
     * Navigates to the previous entry in the backstack
     */
    fun navigateUp() = when {
        backstack.size > 1 -> backstack.removeLastOrNull()

        else -> {
            Logger.i(messageString = "Cannot remove the only entry in backstack!")
            onCloseRequest()
        }
    }
}
