package io.github.culpen90.rillvoro.settings.export

import android.content.Context
import io.github.culpen90.rillvoro.database.AppDatabase.Companion.DATABASE_NAME
import java.nio.file.Path

/**
 * Locates specific files of Rillvoro based on the home directory of the app.
 */
class BackupFileLocator(context: Context) {
    companion object {
        // Keep the archive entry readable by existing backup tools.
        const val FILE_NAME_DB = "newpipe.db"

        @Deprecated(
            "Serializing preferences with Java's ObjectOutputStream is vulnerable to injections",
            replaceWith = ReplaceWith("FILE_NAME_JSON_PREFS")
        )
        const val FILE_NAME_SERIALIZED_PREFS = "newpipe.settings"
        const val FILE_NAME_JSON_PREFS = "preferences.json"
    }

    val db: Path = context.getDatabasePath(DATABASE_NAME).toPath()
    val dbJournal: Path = db.resolveSibling("$DATABASE_NAME-journal")
    val dbShm: Path = db.resolveSibling("$DATABASE_NAME-shm")
    val dbWal: Path = db.resolveSibling("$DATABASE_NAME-wal")
}
