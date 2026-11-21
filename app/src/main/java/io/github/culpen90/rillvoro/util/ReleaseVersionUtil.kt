package io.github.culpen90.rillvoro.util

import io.github.culpen90.rillvoro.App
import io.github.culpen90.rillvoro.shared.platform.AndroidBuildInfo
import java.time.Instant
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

object ReleaseVersionUtil {
    private val stableVersion = Regex("""v?(\d+)\.(\d+)\.(\d+)""")

    val isReleaseApk by lazy { AndroidBuildInfo(App.instance).isReleaseApk }

    private fun versionParts(version: String): List<Int>? {
        val parts = stableVersion.matchEntire(version)?.groupValues ?: return null
        return parts.drop(1).map { it.toIntOrNull() ?: return null }
    }

    fun isNewerRelease(installedVersion: String, releaseTag: String): Boolean {
        val installed = versionParts(installedVersion) ?: return false
        val latest = versionParts(releaseTag) ?: return false
        for (index in latest.indices) {
            if (latest[index] != installed[index]) return latest[index] > installed[index]
        }
        return false
    }

    fun isLastUpdateCheckExpired(expiry: Long): Boolean {
        return Instant.ofEpochSecond(expiry) < Instant.now()
    }

    /**
     * Coerce expiry date time in between 6 hours and 72 hours from now
     *
     * @return Epoch second of expiry date time
     */
    fun coerceUpdateCheckExpiry(expiryString: String?): Long {
        val nowPlus6Hours = ZonedDateTime.now().plusHours(6)
        val expiry = try {
            expiryString?.let { ZonedDateTime.parse(it, DateTimeFormatter.RFC_1123_DATE_TIME) }
        } catch (_: DateTimeParseException) {
            null
        }
        return (expiry ?: nowPlus6Hours).coerceIn(nowPlus6Hours, nowPlus6Hours.plusHours(66)).toEpochSecond()
    }
}
