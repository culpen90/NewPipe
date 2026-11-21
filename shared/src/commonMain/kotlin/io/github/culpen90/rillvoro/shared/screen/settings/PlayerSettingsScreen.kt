/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.screen.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.github.culpen90.rillvoro.shared.composable.TopAppBar
import io.github.culpen90.rillvoro.shared.navigation.Navigator
import io.github.culpen90.rillvoro.shared.platform.PlayerSettingsSections
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.koinInject
import rillvoro.shared.generated.resources.Res
import rillvoro.shared.generated.resources.settings_category_exoplayer_title

@Composable
fun PlayerSettingsScreen(
    navigator: Navigator = koinInject(),
    sections: PlayerSettingsSections = koinInject()
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = stringResource(Res.string.settings_category_exoplayer_title),
                onNavigateUp = { navigator.navigateUp() }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = paddingValues.calculateTopPadding())
                .verticalScroll(rememberScrollState())
                .padding(WindowInsets.navigationBars.asPaddingValues())
        ) {
            sections.Render()
        }
    }
}
