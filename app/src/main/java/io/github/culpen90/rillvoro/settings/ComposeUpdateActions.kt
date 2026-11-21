/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.settings

import android.content.Context
import io.github.culpen90.rillvoro.NewVersionWorker
import io.github.culpen90.rillvoro.shared.platform.UpdateActions

class ComposeUpdateActions(private val context: Context) : UpdateActions {

    override fun checkForUpdates() = NewVersionWorker.enqueueNewVersionCheckingWork(context, isManual = true)
}
