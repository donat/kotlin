/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.statistics

/* Note: along with adding a group to this enum you should also add its GROUP_ID to plugin.xml and get it whitelisted
 * (see https://confluence.jetbrains.com/display/FUS/IntelliJ+Reporting+API).
 *
 * Default value for [events] parameter is intended for collectors which don't have yet a set of allowed values for FUS Whitelist
 */
enum class FUSEventGroups(groupIdSuffix: String, val events: Set<String> = hashSetOf()) {

    GradleTarget("gradle.target", gradleTargetEvents),
    MavenTarget("maven.target", mavenTargetEvents),
    JPSTarget("jps.target", JPSTargetEvents),
    Refactoring("ide.action.refactoring"),
    NewFileTemplate("ide.newFileTempl"),
    NPWizards("ide.npwizards"),
    DebugEval("ide.debugger.eval");

    val GROUP_ID: String = "kotlin.$groupIdSuffix"
}

val gradleTargetEvents = hashSetOf(
    "kotlin-android",
    "kotlin-platform-common",
    "kotlin-platform-js",
    "kotlin-platform-jvm",
    "MPP.androidJvm",
    "MPP.androidJvm.android",
    "MPP.common",
    "MPP.common.metadata",
    "MPP.js",
    "MPP.js.js",
    "MPP.jvm",
    "MPP.jvm.jvm",
    "MPP.jvm.jvmWithJava",
    "MPP.native",
    "MPP.native.androidNativeArm32",
    "MPP.native.androidNativeArm64",
    "MPP.native.iosArm32",
    "MPP.native.iosArm64",
    "MPP.native.iosX64",
    "MPP.native.linuxArm32Hfp",
    "MPP.native.linuxArm64",
    "MPP.native.linuxMips32",
    "MPP.native.linuxMipsel32",
    "MPP.native.linuxX64",
    "MPP.native.macosX64",
    "MPP.native.mingwX64",
    "MPP.native.mingwX86",
    "MPP.native.wasm32",
    "MPP.native.zephyrStm32f4Disco"
)
val mavenTargetEvents = hashSetOf(
    "common",
    "js",
    "jvm"
)
val JPSTargetEvents = hashSetOf(
    "common",
    "js",
    "jvm",
    "native"
)