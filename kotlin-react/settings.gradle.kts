rootProject.name = "sample-name"
include("src:main:ui")

buildscript {
    repositories {
        gradlePluginPortal()
        maven(url = "https://dl.equo.dev/gradle/0.6.2")
    }

    dependencies {
        classpath("com.equo:com.equo.gradle.plugin:0.6.2")
    }
}

apply(plugin = "com.equo")