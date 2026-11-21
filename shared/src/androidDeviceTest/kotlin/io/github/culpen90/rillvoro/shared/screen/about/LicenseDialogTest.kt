/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.screen.about

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performScrollToNode
import androidx.compose.ui.test.v2.runComposeUiTest
import io.github.culpen90.rillvoro.shared.model.License
import kotlin.test.Test
import kotlin.test.assertTrue
import org.jetbrains.compose.resources.getString
import rillvoro.shared.generated.resources.Res
import rillvoro.shared.generated.resources.website_title

@OptIn(ExperimentalTestApi::class)
class LicenseDialogTest {

    @Test
    fun testLicenseDialog() = runComposeUiTest {
        val license = License(
            name = "NewPipe e.V.",
            spdxID = "GPL-3.0-or-later",
            website = "https://newpipe-ev.de/"
        )
        var websiteActionClicked = false
        setContent {
            LicenseDialog(
                license = license,
                onOpenWebsite = { websiteActionClicked = true }
            )
        }

        onNodeWithText(license.name).assertIsDisplayed()
        onNodeWithTag(TEST_TAG_LICENSE_TEXT)
            .performScrollToNode(hasText("https://www.gnu.org/philosophy/why-not-lgpl.html", substring = true))
            .assertIsDisplayed()
        onNodeWithText(getString(Res.string.website_title)).apply {
            performClick()
            assertTrue(websiteActionClicked)
        }
    }
}
