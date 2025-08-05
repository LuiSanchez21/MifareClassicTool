// settings.gradle.kts
pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    plugins {
        id("com.android.application") version "8.6.0"
        id("org.jetbrains.kotlin.android") version "1.9.10"
    }
}

dependencyResolutionManagement {
    // Evita repositorios duplicados en módulos individuales
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    // Aquí defines de dónde se traen las dependencias de implementacion
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "MifareClassicTool"
include(":app")
