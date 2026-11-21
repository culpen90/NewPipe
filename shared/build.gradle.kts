/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.kotlin.compose)
    alias(libs.plugins.jetbrains.compose.multiplatform)
    alias(libs.plugins.koin)
    alias(libs.plugins.jetbrains.kotlinx.serialization)
}

// Better than adding a third-party dependency for something as simple as this
// https://stackoverflow.com/a/74771876/8446131
val buildConfigGenerator by tasks.registering(Sync::class) {
    val buildConfigPackage = RILLVORO_SHARED_NAMESPACE
    val signerSha256 = providers.systemProperty("releaseCertSha256").getOrElse("").replace(":", "").lowercase()
    require(signerSha256.isEmpty() || signerSha256.matches(Regex("[0-9a-f]{64}"))) {
        "releaseCertSha256 must be a SHA-256 certificate fingerprint"
    }
    val rawClass = """
        package $buildConfigPackage

        object BuildConfig {
            const val VERSION_NAME = "$RILLVORO_VERSION_NAME"
            const val APP_NAME = "Rillvoro"
            const val ANDROID_APPLICATION_ID = "$RILLVORO_APPLICATION_ID"
            const val ANDROID_RELEASE_CERT_SHA256 = "$signerSha256"
        }
    """.trimIndent()
    from(resources.text.fromString(rawClass)) {
        rename { "BuildConfig.kt" }
        into(buildConfigPackage.replace(".", "/"))
    }
    into(layout.buildDirectory.dir("generated/kotlin/"))
}

kotlin {
    jvmToolchain(21)

    compilerOptions {
        optIn.addAll(
            "androidx.compose.material3.ExperimentalMaterial3Api",
            "androidx.compose.material3.ExperimentalMaterial3ExpressiveApi",
            "androidx.compose.foundation.layout.ExperimentalLayoutApi"
        )
    }

    android {
        namespace = RILLVORO_SHARED_NAMESPACE
        compileSdk {
            version = release(RILLVORO_VERSION_SDK_COMPILE_MAJOR) {
                minorApiLevel = RILLVORO_VERSION_SDK_COMPILE_MINOR
            }
        }
        minSdk {
            version = release(RILLVORO_VERSION_SDK_MIN)
        }
        androidResources {
            enable = true
        }

        optimization {
            consumerKeepRules.apply {
                publish = true
                file("consumer-proguard-rules.pro")
            }
        }

        withDeviceTestBuilder {
            sourceSetTreeName = "test"
        }.configure {
            instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        }
    }

    sourceSets {
        commonMain {
            kotlin.srcDir(buildConfigGenerator.map { it.destinationDir })
            dependencies {
                implementation(libs.jetbrains.compose.runtime)
                implementation(libs.jetbrains.compose.foundation)
                implementation(libs.jetbrains.compose.material3)
                implementation(libs.jetbrains.compose.ui)
                implementation(libs.jetbrains.compose.resources)
                implementation(libs.jetbrains.compose.preview)

                implementation(libs.jetbrains.lifecycle.viewmodel)

                // Use API as java compiler cannot see NavKey for some reason
                api(libs.jetbrains.navigation3.ui)
                implementation(libs.jetbrains.lifecycle.navigation3)
                implementation(libs.kotlinx.serialization.json)

                implementation(libs.koin.compose.navigation3)
                implementation(libs.koin.compose.viewmodel)
                implementation(libs.koin.annotations)

                implementation(libs.russhwolf.settings.core)
                implementation(libs.touchlab.kermit)
            }
        }
        androidMain.dependencies {
            implementation(libs.jetbrains.compose.preview)
            implementation(libs.androidx.activity)
            implementation(libs.androidx.appcompat)
            implementation(libs.androidx.preference)
            implementation(libs.androidx.browser)
        }
        val androidDeviceTest by getting {
            dependencies {
                implementation(libs.kotlin.test.core)
                implementation(libs.jetbrains.compose.test.ui)
                implementation(libs.russhwolf.settings.test)
                implementation(libs.androidx.compose.test.ui.manifest)
                implementation(libs.androidx.compose.test.ui.junit)

                // Needed because androidx.compose.test.ui.junit pulls an older dependency
                // which crashes on new Android versions
                implementation(libs.androidx.test.espresso.core)
            }
        }
    }
}

dependencies {
    androidRuntimeClasspath(libs.jetbrains.compose.tooling)
}
