package io.github.culpen90.rillvoro

import io.github.culpen90.rillvoro.util.ReleaseVersionUtil.coerceUpdateCheckExpiry
import io.github.culpen90.rillvoro.util.ReleaseVersionUtil.isLastUpdateCheckExpired
import io.github.culpen90.rillvoro.util.ReleaseVersionUtil.isNewerRelease
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import kotlin.math.abs
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class NewVersionManagerTest {

    @Test
    fun `Release tags are compared numerically and must be stable`() {
        assertTrue(isNewerRelease("0.9.12", "v0.10.0"))
        assertFalse(isNewerRelease("1.0.0", "v0.99.99"))
        assertFalse(isNewerRelease("1.0.0", "v1.0.0"))
        assertFalse(isNewerRelease("1.0.0", "v2.0.0-rc1"))
        assertFalse(isNewerRelease("1.0.0", "latest"))
    }

    @Test
    fun `Expiry is reached`() {
        val oneHourEarlier = Instant.now().atZone(ZoneId.of("GMT")).minusHours(1)

        val expired = isLastUpdateCheckExpired(oneHourEarlier.toEpochSecond())

        assertTrue(expired)
    }

    @Test
    fun `Expiry is not reached`() {
        val oneHourLater = Instant.now().atZone(ZoneId.of("GMT")).plusHours(1)

        val expired = isLastUpdateCheckExpired(oneHourLater.toEpochSecond())

        assertFalse(expired)
    }

    /**
     * Equal within a range of 5 seconds
     */
    private fun assertNearlyEqual(a: Long, b: Long) {
        assertTrue(abs(a - b) < 5)
    }

    @Test
    fun `Expiry must be returned as is because it is inside the acceptable range of 6-72 hours`() {
        val sixHoursLater = Instant.now().atZone(ZoneId.of("GMT")).plusHours(6)

        val coerced = coerceUpdateCheckExpiry(DateTimeFormatter.RFC_1123_DATE_TIME.format(sixHoursLater))

        assertNearlyEqual(sixHoursLater.toEpochSecond(), coerced)
    }

    @Test
    fun `Expiry must be increased to 6 hours if below`() {
        val tooLow = Instant.now().atZone(ZoneId.of("GMT")).plusHours(5)

        val coerced = coerceUpdateCheckExpiry(DateTimeFormatter.RFC_1123_DATE_TIME.format(tooLow))

        assertNearlyEqual(tooLow.plusHours(1).toEpochSecond(), coerced)
    }

    @Test
    fun `Expiry must be decreased to 72 hours if above`() {
        val tooHigh = Instant.now().atZone(ZoneId.of("GMT")).plusHours(73)

        val coerced = coerceUpdateCheckExpiry(DateTimeFormatter.RFC_1123_DATE_TIME.format(tooHigh))

        assertNearlyEqual(tooHigh.minusHours(1).toEpochSecond(), coerced)
    }
}
