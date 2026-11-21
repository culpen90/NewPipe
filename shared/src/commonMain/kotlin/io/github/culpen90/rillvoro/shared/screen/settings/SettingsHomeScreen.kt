/*
* SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
* SPDX-License-Identifier: GPL-3.0-or-later
*/

package io.github.culpen90.rillvoro.shared.screen.settings

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewWrapper
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import io.github.culpen90.rillvoro.shared.composable.PreferenceRow
import io.github.culpen90.rillvoro.shared.composable.TopAppBar
import io.github.culpen90.rillvoro.shared.navigation.Navigator
import io.github.culpen90.rillvoro.shared.preview.ThemePreviewProvider
import io.github.culpen90.rillvoro.shared.screen.settings.model.SettingsCategory
import io.github.culpen90.rillvoro.shared.screen.settings.model.SettingsCategoryType
import io.github.culpen90.rillvoro.shared.viewmodel.settings.SettingsViewModel
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.koinInject
import org.koin.compose.viewmodel.koinViewModel
import rillvoro.shared.generated.resources.Res
import rillvoro.shared.generated.resources.ic_search
import rillvoro.shared.generated.resources.search
import rillvoro.shared.generated.resources.settings

@Composable
fun SettingsHomeScreen(
    navigator: Navigator = koinInject(),
    viewModel: SettingsViewModel = koinViewModel()
) {
    val categories by viewModel.categories.collectAsStateWithLifecycle()

    SettingsHomeScreenContent(
        categories = categories.map { type ->
            SettingsCategory(
                title = type.title,
                icon = type.icon,
                onClick = { navigator.navigateTo(type.destination) }
            )
        },
        onNavigateUp = { navigator.navigateUp() }
    )
}

@Composable
fun SettingsHomeScreenContent(
    categories: List<SettingsCategory> = SettingsCategoryType.entries.map { type ->
        SettingsCategory(title = type.title, icon = type.icon)
    },
    onNavigateUp: () -> Unit = {},
    onSearchClick: () -> Unit = {}
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = stringResource(Res.string.settings),
                onNavigateUp = onNavigateUp,
                actions = {
                    IconButton(onClick = onSearchClick) {
                        Icon(
                            painter = painterResource(Res.drawable.ic_search),
                            contentDescription = stringResource(Res.string.search)
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = paddingValues.calculateTopPadding()),
            contentPadding = WindowInsets.navigationBars.asPaddingValues()
        ) {
            items(items = categories) { category ->
                PreferenceRow(
                    title = stringResource(category.title),
                    icon = painterResource(category.icon),
                    onClick = category.onClick
                )
            }
        }
    }
}

@PreviewWrapper(ThemePreviewProvider::class)
@PreviewLightDark
@Composable
private fun SettingsHomeScreenPreview() {
    SettingsHomeScreenContent()
}
