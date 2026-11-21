/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.screen.settings.model

import io.github.culpen90.rillvoro.shared.model.ErrorReport

sealed interface BackupRestoreMessage {

    data object ExportComplete : BackupRestoreMessage

    data object InvalidFile : BackupRestoreMessage

    data object PartialImport : BackupRestoreMessage

    data class Failed(val error: ErrorReport) : BackupRestoreMessage
}
