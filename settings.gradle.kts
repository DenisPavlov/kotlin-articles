rootProject.name = "kotlin-articles"

include("kotlin-switch-when-expression")

pluginManagement {
    plugins {
        kotlin("jvm") version "1.7.10"
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        mavenLocal()
    }
}

