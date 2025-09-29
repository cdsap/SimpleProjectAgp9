// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    id("org.gradle.android.cache-fix") version "3.0.1" apply false
}

subprojects {
    plugins.withType<com.android.build.gradle.api.AndroidBasePlugin>() {
        apply(plugin = "org.gradle.android.cache-fix")
    }
}
