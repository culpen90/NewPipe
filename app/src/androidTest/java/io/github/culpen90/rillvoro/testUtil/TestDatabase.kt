package io.github.culpen90.rillvoro.testUtil

import androidx.room3.Room
import androidx.test.core.app.ApplicationProvider
import io.github.culpen90.rillvoro.RillvoroDatabase
import io.github.culpen90.rillvoro.database.AppDatabase
import org.junit.Assert.assertSame

class TestDatabase {
    companion object {
        fun createReplacingRillvoroDatabase(): AppDatabase {
            val database = Room.inMemoryDatabaseBuilder(
                ApplicationProvider.getApplicationContext(),
                AppDatabase::class.java
            )
                .allowMainThreadQueries()
                .build()

            val databaseField = RillvoroDatabase::class.java.getDeclaredField("databaseInstance")
            databaseField.isAccessible = true
            databaseField.set(RillvoroDatabase::class, database)

            assertSame(
                "Mocking database failed!",
                database,
                RillvoroDatabase.getInstance(ApplicationProvider.getApplicationContext())
            )

            return database
        }
    }
}
