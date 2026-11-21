/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.viewmodel.settings

import androidx.lifecycle.ViewModel
import com.russhwolf.settings.Settings
import io.github.culpen90.rillvoro.shared.platform.UpdateActions
import io.github.culpen90.rillvoro.shared.preferences.UpdatePreferences.DEFAULT_UPDATE_APP
import io.github.culpen90.rillvoro.shared.preferences.UpdatePreferences.KEY_UPDATE_APP
import io.github.culpen90.rillvoro.shared.preferences.UpdatePreferences.KEY_UPDATE_CONSENT
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import org.koin.core.annotation.KoinViewModel

@KoinViewModel
class UpdateSettingsViewModel(
    private val settings: Settings,
    private val updateActions: UpdateActions
) : ViewModel() {

    val updateChecksEnabled: StateFlow<Boolean>
        field = MutableStateFlow(settings.getBoolean(KEY_UPDATE_APP, DEFAULT_UPDATE_APP))

    fun setUpdateChecksEnabled(value: Boolean) {
        settings.putBoolean(KEY_UPDATE_CONSENT, true)
        settings.putBoolean(KEY_UPDATE_APP, value)
        updateChecksEnabled.value = value
        if (value) {
            updateActions.checkForUpdates()
        }
    }
}
