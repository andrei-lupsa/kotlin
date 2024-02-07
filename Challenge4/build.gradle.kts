plugins {
    kotlin("jvm") version "1.9.22"
    application
}

group = "academy.learnprogramming"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("academy.learnprogramming.section6challenge.Section6ChallengeKt")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}