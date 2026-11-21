/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.platform

import android.content.Intent
import io.github.culpen90.rillvoro.shared.model.BackupFile
import io.github.culpen90.rillvoro.shared.model.DataExportResult
import io.github.culpen90.rillvoro.shared.model.DataImportResult
import io.github.culpen90.rillvoro.shared.model.SettingsFormat

interface BackupRestoreHost {

    fun createFilePickerIntent(file: BackupFile): Intent

    suspend fun exportData(file: String): DataExportResult

    suspend fun importDatabase(file: String): DataImportResult

    suspend fun importSettings(file: String, format: SettingsFormat)

    fun finishImport(file: String)

    fun resetSettings()

    fun exportSubscriptions(file: String)

    fun importSubscriptions(file: String)
}
