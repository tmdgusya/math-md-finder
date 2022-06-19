plugins {
    kotlin("jvm") version "1.7.0"
}

group = "org.roach"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-cli-jvm:0.3.4")
}