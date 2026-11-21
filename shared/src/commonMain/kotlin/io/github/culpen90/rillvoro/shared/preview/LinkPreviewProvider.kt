/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.preview

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import io.github.culpen90.rillvoro.shared.Constants
import io.github.culpen90.rillvoro.shared.model.Link

/**
 * Preview provider for composable working with [Link]
 */
class LinkPreviewProvider : PreviewParameterProvider<Link> {

    override val values: Sequence<Link>
        get() = sequenceOf(
            Link(
                title = "Rillvoro on GitHub",
                description = "Read the source code and report issues.",
                action = "View on GitHub",
                url = Constants.URL_GITHUB
            )
        )
}
