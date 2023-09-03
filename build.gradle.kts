plugins {
    kotlin("jvm") version "1.9.0"
    id("maven-publish")
    id("pl.allegro.tech.build.axion-release") version "1.15.4"
}

group = "io.github.marad"
project.version = scmVersion.version

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("io.kotest:kotest-assertions-core-jvm:5.7.0")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}
