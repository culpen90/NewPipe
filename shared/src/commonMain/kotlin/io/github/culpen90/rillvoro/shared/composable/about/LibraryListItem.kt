/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.composable.about

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewWrapper
import io.github.culpen90.rillvoro.shared.model.Library
import io.github.culpen90.rillvoro.shared.preview.LibraryPreviewProvider
import io.github.culpen90.rillvoro.shared.preview.ThemePreviewProvider
import org.jetbrains.compose.resources.stringResource
import rillvoro.shared.generated.resources.Res
import rillvoro.shared.generated.resources.license
import rillvoro.shared.generated.resources.not_available

/**
 * Composable to display library details which are being used in the app
 * @param modifier Modifier for the composable
 * @param library Library to show the details
 * @param onClick Callback when this composable is clicked
 */
@Composable
fun LibraryListItem(modifier: Modifier = Modifier, library: Library, onClick: () -> Unit = {}) {
    val description = when {
        library.developers.isNotEmpty() && library.licenses.isNotEmpty() -> {
            stringResource(
                Res.string.license,
                library.developers.first().name,
                library.licenses.first()
            )
        }

        else -> {
            stringResource(Res.string.not_available)
        }
    }

    ListItem(
        modifier = modifier,
        onClick = onClick,
        enabled = library.licenses.isNotEmpty(),
        content = {
            Column {
                Text(
                    text = library.name,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = description,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    )
}

@PreviewWrapper(ThemePreviewProvider::class)
@PreviewLightDark
@Composable
private fun LibraryListItemPreview(
    @PreviewParameter(LibraryPreviewProvider::class) library: Library
) {
    LibraryListItem(library = library)
}
