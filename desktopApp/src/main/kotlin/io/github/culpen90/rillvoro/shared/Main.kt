/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared

import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.toComposeImageBitmap
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import javax.imageio.ImageIO

/**
 * Entry point for compose-related UI components on Desktop
 */
fun main() = application {
    val icon = remember {
        val image = requireNotNull(Thread.currentThread().contextClassLoader.getResource("rillvoro_icon.png"))
        BitmapPainter(ImageIO.read(image).toComposeImageBitmap())
    }
    Window(onCloseRequest = ::exitApplication, title = "Rillvoro", icon = icon) {
        App(onCloseRequest = ::exitApplication)
    }
}
