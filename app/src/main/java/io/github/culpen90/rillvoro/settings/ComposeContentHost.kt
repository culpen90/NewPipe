/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.settings

import android.content.Context
import coil3.SingletonImageLoader
import io.github.culpen90.rillvoro.DownloaderImpl
import io.github.culpen90.rillvoro.player.helper.PlayerHelper
import io.github.culpen90.rillvoro.shared.platform.ContentHost
import io.github.culpen90.rillvoro.util.Localization
import io.github.culpen90.rillvoro.util.image.ImageStrategy
import io.github.culpen90.rillvoro.util.image.PreferredImageQuality
import org.schabi.newpipe.extractor.NewPipe

class ComposeContentHost(private val context: Context) : ContentHost {

    override fun applyImageQuality(quality: String) {
        ImageStrategy.setPreferredImageQuality(PreferredImageQuality.fromPreferenceKey(context, quality))
        val loader = SingletonImageLoader.get(context)
        loader.memoryCache?.clear()
        loader.diskCache?.clear()
    }

    override fun applyYoutubeRestrictedMode(enabled: Boolean) = DownloaderImpl.getInstance().updateYoutubeRestrictedModeCookies(enabled)

    override fun applyContentLocalization() {
        NewPipe.setupLocalization(
            Localization.getPreferredLocalization(context),
            Localization.getPreferredContentCountry(context)
        )
        PlayerHelper.resetFormat()
    }
}
