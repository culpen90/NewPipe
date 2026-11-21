package io.github.culpen90.rillvoro

import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.app.PendingIntentCompat
import androidx.core.content.ContextCompat
import androidx.core.content.edit
import androidx.core.net.toUri
import androidx.preference.PreferenceManager
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.Worker
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import com.grack.nanojson.JsonObject
import com.grack.nanojson.JsonParser
import com.grack.nanojson.JsonParserException
import io.github.culpen90.rillvoro.util.ReleaseVersionUtil
import java.io.IOException
import okhttp3.Request

class NewVersionWorker(
    context: Context,
    workerParams: WorkerParameters
) : Worker(context, workerParams) {

    private fun notifyIfUpdateAvailable(releaseTag: String?) {
        if (releaseTag == null || !ReleaseVersionUtil.isNewerRelease(BuildConfig.VERSION_NAME, releaseTag)) {
            if (inputData.getBoolean(IS_MANUAL, false)) {
                // Show toast stating that the app is up-to-date if the update check was manual.
                ContextCompat.getMainExecutor(applicationContext).execute {
                    Toast.makeText(
                        applicationContext,
                        R.string.app_update_unavailable_toast,
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            return
        }

        val intent = Intent(Intent.ACTION_VIEW, "https://github.com/$REPOSITORY/releases/tag/$releaseTag".toUri())
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        val pendingIntent = PendingIntentCompat.getActivity(
            applicationContext,
            0,
            intent,
            0,
            false
        )
        val channelId = applicationContext.getString(R.string.app_update_notification_channel_id)
        val notificationBuilder = NotificationCompat.Builder(applicationContext, channelId)
            .setSmallIcon(R.drawable.ic_rillvoro_update)
            .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
            .setAutoCancel(true)
            .setContentIntent(pendingIntent)
            .setContentTitle(
                applicationContext.getString(R.string.app_update_available_notification_title)
            )
            .setContentText(
                applicationContext.getString(
                    R.string.app_update_available_notification_text,
                    releaseTag
                )
            )

        val notificationManager = NotificationManagerCompat.from(applicationContext)
        if (notificationManager.areNotificationsEnabled()) {
            notificationManager.notify(2000, notificationBuilder.build())
        }
    }

    override fun doWork(): Result {
        if (!ReleaseVersionUtil.isReleaseApk) return Result.success()
        val prefs = PreferenceManager.getDefaultSharedPreferences(applicationContext)
        val expiryKey = applicationContext.getString(R.string.update_expiry_key)
        if (!inputData.getBoolean(IS_MANUAL, false)) {
            val enabled = prefs.getBoolean(applicationContext.getString(R.string.update_app_key), false)
            val consent = prefs.getBoolean(applicationContext.getString(R.string.update_check_consent_key), false)
            if (!enabled || !consent || !ReleaseVersionUtil.isLastUpdateCheckExpired(prefs.getLong(expiryKey, 0))) {
                return Result.success()
            }
        }

        val request = Request.Builder().url("https://api.github.com/repos/$REPOSITORY/releases/latest").build()
        return try {
            DownloaderImpl.getInstance().client.newCall(request).execute().use { response ->
                val tag = when {
                    response.code == 404 -> null

                    response.isSuccessful -> {
                        val release = JsonParser.`object`().from(response.body.charStream())
                        val hasApk = release.getArray("assets").any { asset ->
                            asset is JsonObject && asset.getString("name", "").endsWith(".apk", ignoreCase = true)
                        }
                        if (hasApk) release.getString("tag_name") else null
                    }

                    else -> throw IOException("Release check returned HTTP ${response.code}")
                }
                prefs.edit { putLong(expiryKey, ReleaseVersionUtil.coerceUpdateCheckExpiry(response.header("Expires"))) }
                notifyIfUpdateAvailable(tag)
            }
            Result.success()
        } catch (e: IOException) {
            Log.w(TAG, "Could not fetch the latest release", e)
            Result.failure()
        } catch (e: JsonParserException) {
            Log.w(TAG, "Invalid release response", e)
            Result.failure()
        }
    }

    companion object {
        private val TAG = NewVersionWorker::class.java.simpleName
        private const val REPOSITORY = "culpen90/Rillvoro"
        private const val IS_MANUAL = "isManual"

        @JvmStatic
        fun enqueueNewVersionCheckingWork(context: Context, isManual: Boolean) {
            val workRequest = OneTimeWorkRequestBuilder<NewVersionWorker>()
                .setInputData(workDataOf(IS_MANUAL to isManual))
                .build()
            WorkManager.getInstance(context).enqueue(workRequest)
        }
    }
}
