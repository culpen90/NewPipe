package io.github.culpen90.rillvoro.shared.screen.settings.model

import io.github.culpen90.rillvoro.shared.navigation.Destination
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource
import rillvoro.shared.generated.resources.Res
import rillvoro.shared.generated.resources.content
import rillvoro.shared.generated.resources.ic_bug_report
import rillvoro.shared.generated.resources.ic_cloud_download
import rillvoro.shared.generated.resources.ic_file_download
import rillvoro.shared.generated.resources.ic_headset
import rillvoro.shared.generated.resources.ic_history
import rillvoro.shared.generated.resources.ic_language
import rillvoro.shared.generated.resources.ic_notifications
import rillvoro.shared.generated.resources.ic_palette
import rillvoro.shared.generated.resources.ic_settings_backup_restore
import rillvoro.shared.generated.resources.notifications
import rillvoro.shared.generated.resources.settings_category_appearance_title
import rillvoro.shared.generated.resources.settings_category_backup_restore_title
import rillvoro.shared.generated.resources.settings_category_debug_title
import rillvoro.shared.generated.resources.settings_category_downloads_title
import rillvoro.shared.generated.resources.settings_category_history_title
import rillvoro.shared.generated.resources.settings_category_updates_title
import rillvoro.shared.generated.resources.settings_category_video_audio_title

/**
 * Categories on the settings home screen.
 */
enum class SettingsCategoryType(
    val title: StringResource,
    val icon: DrawableResource,
    val destination: Destination
) {
    VIDEO_AUDIO(
        title = Res.string.settings_category_video_audio_title,
        icon = Res.drawable.ic_headset,
        destination = Destination.VideoAudioSettings
    ),
    DOWNLOADS(
        title = Res.string.settings_category_downloads_title,
        icon = Res.drawable.ic_file_download,
        destination = Destination.DownloadSettings
    ),
    APPEARANCE(
        title = Res.string.settings_category_appearance_title,
        icon = Res.drawable.ic_palette,
        destination = Destination.AppearanceSettings
    ),
    HISTORY(
        title = Res.string.settings_category_history_title,
        icon = Res.drawable.ic_history,
        destination = Destination.HistorySettings
    ),
    CONTENT(
        title = Res.string.content,
        icon = Res.drawable.ic_language,
        destination = Destination.ContentSettings
    ),
    NOTIFICATIONS(
        title = Res.string.notifications,
        icon = Res.drawable.ic_notifications,
        destination = Destination.NotificationSettings
    ),
    UPDATES(
        title = Res.string.settings_category_updates_title,
        icon = Res.drawable.ic_cloud_download,
        destination = Destination.UpdateSettings
    ),
    BACKUP_RESTORE(
        title = Res.string.settings_category_backup_restore_title,
        icon = Res.drawable.ic_settings_backup_restore,
        destination = Destination.BackupRestoreSettings
    ),
    DEBUG(
        title = Res.string.settings_category_debug_title,
        icon = Res.drawable.ic_bug_report,
        destination = Destination.DebugSettings
    )
}
