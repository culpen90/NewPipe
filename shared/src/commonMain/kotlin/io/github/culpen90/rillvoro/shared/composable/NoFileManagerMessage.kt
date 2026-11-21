/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.composable

import androidx.compose.runtime.Composable
import org.jetbrains.compose.resources.stringResource
import rillvoro.shared.generated.resources.Res
import rillvoro.shared.generated.resources.downloads_storage_use_saf_title
import rillvoro.shared.generated.resources.no_appropriate_file_manager_message
import rillvoro.shared.generated.resources.no_appropriate_file_manager_message_android_10

@Composable
fun noFileManagerMessage(storageAccessFrameworkConfigurable: Boolean): String = when {
    // Only Android 9 and below can be told to turn SAF off
    storageAccessFrameworkConfigurable -> {
        stringResource(
            Res.string.no_appropriate_file_manager_message,
            stringResource(Res.string.downloads_storage_use_saf_title)
        )
    }

    else -> {
        stringResource(Res.string.no_appropriate_file_manager_message_android_10)
    }
}
