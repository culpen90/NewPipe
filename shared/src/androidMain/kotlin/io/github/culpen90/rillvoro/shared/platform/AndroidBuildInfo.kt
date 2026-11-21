/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.platform

import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import androidx.core.content.pm.PackageInfoCompat
import co.touchlab.kermit.Logger
import io.github.culpen90.rillvoro.shared.BuildConfig
import org.koin.core.annotation.Singleton

@Singleton(binds = [BuildInfo::class])
class AndroidBuildInfo(private val context: Context) : BuildInfo {

    override val isDebug: Boolean
        get() = (context.applicationInfo.flags and ApplicationInfo.FLAG_DEBUGGABLE != 0) || !isReleaseApk

    @get:SuppressLint("NewApi")
    @OptIn(ExperimentalStdlibApi::class)
    override val isReleaseApk: Boolean by lazy {
        if (context.packageName != BuildConfig.ANDROID_APPLICATION_ID ||
            context.applicationInfo.flags and ApplicationInfo.FLAG_DEBUGGABLE != 0 ||
            BuildConfig.ANDROID_RELEASE_CERT_SHA256.isEmpty()
        ) return@lazy false

        val certificates = mapOf(
            BuildConfig.ANDROID_RELEASE_CERT_SHA256.hexToByteArray() to PackageManager.CERT_INPUT_SHA256
        )
        try {
            PackageInfoCompat.hasSignatures(
                context.packageManager,
                context.packageName,
                certificates,
                false
            )
        } catch (exception: PackageManager.NameNotFoundException) {
            Logger.e(messageString = "Could not find package info", throwable = exception)
            false
        }
    }
}
