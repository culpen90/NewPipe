/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.extensions

import android.content.Context
import android.content.Intent
import io.github.culpen90.rillvoro.shared.ComposeActivity
import io.github.culpen90.rillvoro.shared.android.Constants
import io.github.culpen90.rillvoro.shared.navigation.Destination
import kotlinx.serialization.json.Json

/**
 * Navigates to a given compose destination
 */
fun Context.navigateTo(destination: Destination) = Intent(this, ComposeActivity::class.java).also { intent ->
    intent.putExtra(Constants.INTENT_SCREEN_KEY, Json.encodeToString(destination))
    startActivity(intent)
}
