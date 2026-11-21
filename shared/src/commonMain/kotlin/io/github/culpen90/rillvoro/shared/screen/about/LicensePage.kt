/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.screen.about

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.saveable.rememberSerializable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewWrapper
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import io.github.culpen90.rillvoro.shared.composable.about.LibraryListItem
import io.github.culpen90.rillvoro.shared.model.Library
import io.github.culpen90.rillvoro.shared.model.License
import io.github.culpen90.rillvoro.shared.platform.ShareHandler
import io.github.culpen90.rillvoro.shared.preview.LibraryPreviewProvider
import io.github.culpen90.rillvoro.shared.preview.ThemePreviewProvider
import io.github.culpen90.rillvoro.shared.theme.spaceMedium
import io.github.culpen90.rillvoro.shared.theme.spaceXSmall
import io.github.culpen90.rillvoro.shared.theme.spaceXXSmall
import io.github.culpen90.rillvoro.shared.viewmodel.about.AboutViewModel
import kotlin.random.Random
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.koinInject
import org.koin.compose.viewmodel.koinViewModel
import rillvoro.shared.generated.resources.Res
import rillvoro.shared.generated.resources.app_license
import rillvoro.shared.generated.resources.app_license_title
import rillvoro.shared.generated.resources.read_full_license
import rillvoro.shared.generated.resources.title_licenses

@Composable
fun LicensePage(
    viewModel: AboutViewModel = koinViewModel(),
    shareHandler: ShareHandler = koinInject()
) {
    val libraries by viewModel.libraries.collectAsStateWithLifecycle()

    LicensePageContent(
        libraries = libraries,
        onOpenUrl = { url -> shareHandler.openUrlInBrowser(url) }
    )
}

@Composable
fun LicensePageContent(
    libraries: List<Library> = emptyList(),
    onOpenUrl: (url: String) -> Unit = {}
) {
    var shouldShowLicenseDialog by rememberSaveable { mutableStateOf(false) }
    var licenseToShow by rememberSerializable { mutableStateOf(License()) }

    if (shouldShowLicenseDialog && licenseToShow.spdxID.isNotBlank()) {
        LicenseDialog(
            license = licenseToShow,
            onOpenWebsite = { website -> onOpenUrl(website) },
            onDismiss = { shouldShowLicenseDialog = false }
        )
    }

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = WindowInsets.navigationBars.asPaddingValues(),
        verticalArrangement = Arrangement.spacedBy(spaceXXSmall)
    ) {
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(spaceMedium),
                verticalArrangement = Arrangement.spacedBy(spaceXSmall)
            ) {
                Text(
                    text = stringResource(Res.string.app_license_title),
                    style = MaterialTheme.typography.titleLarge
                )
                Text(
                    text = stringResource(Res.string.app_license),
                    style = MaterialTheme.typography.bodyMedium
                )

                TextButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.End),
                    onClick = {
                        licenseToShow = License(
                            name = "Rillvoro",
                            website = "https://github.com/culpen90/Rillvoro#readme",
                            spdxID = "GPL-3.0-or-later"
                        )
                        shouldShowLicenseDialog = true
                    }
                ) {
                    Text(text = stringResource(Res.string.read_full_license))
                }

                Text(
                    text = stringResource(Res.string.title_licenses),
                    style = MaterialTheme.typography.titleLarge
                )
            }
        }

        // Third-party libraries and licenses
        items(items = libraries, key = { library -> library.id }) { library ->
            LibraryListItem(
                library = library,
                onClick = {
                    licenseToShow = License(
                        name = library.name,
                        website = library.website,
                        spdxID = library.licenses.first()
                    )
                    shouldShowLicenseDialog = true
                }
            )
        }
    }
}

@PreviewWrapper(ThemePreviewProvider::class)
@PreviewLightDark
@Composable
private fun LicensePagePreview(
    @PreviewParameter(LibraryPreviewProvider::class) library: Library
) {
    val libraries = List(10) {
        library.copy(id = Random.nextInt().toString())
    }
    LicensePageContent(libraries = libraries)
}
