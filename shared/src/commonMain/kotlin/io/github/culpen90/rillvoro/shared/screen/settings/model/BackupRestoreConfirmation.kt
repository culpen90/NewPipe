/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.screen.settings.model

sealed interface BackupRestoreConfirmation {

    data object ResetSettings : BackupRestoreConfirmation

    data class DataImport(val file: String) : BackupRestoreConfirmation

    data class SubscriptionsImport(val file: String) : BackupRestoreConfirmation
}
