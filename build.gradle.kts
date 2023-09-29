plugins {
    id("java-library")
    kotlin("jvm") version "1.9.0"
    id("maven-publish")
    id("signing")
    id("pl.allegro.tech.build.axion-release") version "1.15.4"
}

group = "io.github.marad"
project.version = scmVersion.version

publishing {
    publications {
        create<MavenPublication>("library") {
            groupId = "io.github.marad"
            artifactId = "kotlin-html-dsl"
            version = scmVersion.version
            artifact(tasks.jar)
            artifact(tasks.kotlinSourcesJar)
        }
        withType<MavenPublication> {
            pom {
                packaging = "jar"
                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://opensource.org/licenses/MIT")
                    }
                }
                issueManagement {
                    system.set("GitHub")
                    url.set("https://github.com/marad/kotlin-html-dsl/issues")
                }
                developers {
                    developer {
                        id.set("marad")
                        name.set("Marcin Radoszewski")
                        email.set("moriturius@gmail.com")
                    }
                }
                scm {
                    connection.set("scm:git:https://github.com/marad/kotlin-html-dsl.git")
                    developerConnection.set("scm:git:ssh://git@github.com:marad/kotlin-html-dsl.git")
                    url.set("https://github.com/marad/kotlin-html-dsl")
                }
            }

        }

    }

    repositories {
        maven {
            name = "OSSRH"
            val releasesRepoUrl = "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"
            val snapshotsRepoUrl = "https://s01.oss.sonatype.org/content/repositories/snapshots/"
            url = uri(if (scmVersion.version.endsWith("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl)
            println("Publishing version ${scmVersion.version} to $url")
            credentials {
                username = System.getenv("OSSRH_USERNAME")
                password = System.getenv("OSSRH_PASSWORD")
            }
        }
    }
}

signing {
    val key = System.getenv("GPG_KEY")
    val pass = System.getenv("GPG_PASS")
    useInMemoryPgpKeys(key, pass)
    sign(publishing.publications)
}

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

java {
    withSourcesJar()
    withJavadocJar()
}

kotlin {
//    jvmToolchain(17)
//    jvmToolchain {
//        languageVersion.set(JavaLanguageVersion.of(8))
//    }
}

tasks.javadoc {
    if (JavaVersion.current().isJava9Compatible) {
        (options as StandardJavadocDocletOptions).addBooleanOption("html5", true)
    }
}

tasks.jar {
    enabled = true
    archiveClassifier.set("")
}