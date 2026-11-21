/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.jetbrains.kotlin.jvm)
    alias(libs.plugins.jetbrains.kotlin.compose)
    alias(libs.plugins.jetbrains.compose.multiplatform)
    alias(libs.plugins.about.libraries)
}

dependencies {
    implementation(projects.shared)

    implementation(compose.desktop.currentOs)
    implementation(libs.jetbrains.coroutines.swing)
    implementation(libs.jetbrains.compose.preview)
}

val iconAssets = rootProject.layout.projectDirectory.dir("assets")

tasks.processResources {
    from(iconAssets.file("rillvoro_icon.png"))
}

compose.desktop {
    application {
        mainClass = "io.github.culpen90.rillvoro.shared.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "Rillvoro"
            macOS {
                bundleID = RILLVORO_APPLICATION_ID
                iconFile.set(iconAssets.file("rillvoro_icon.icns"))
            }
            windows { iconFile.set(iconAssets.file("rillvoro_icon.ico")) }
            linux {
                packageName = "rillvoro"
                iconFile.set(iconAssets.file("rillvoro_icon.png"))
            }
            packageVersion = RILLVORO_VERSION_NAME
        }
    }
}

aboutLibraries {
    export {
        outputFile = file("../shared/src/jvmMain/resources/aboutlibraries.json")
        prettyPrint = true
        excludeFields.addAll("organization", "scm", "funding")
    }
}
