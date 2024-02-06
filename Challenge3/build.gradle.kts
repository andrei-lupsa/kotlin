plugins {
    kotlin("jvm") version "1.9.22"
    application
}

group = "academy.learnprogramming"
version = "1.0-SNAPSHOT"

application{
    mainClass.set("academy.learnprogramming.oochallenge.OOChallengeKt")
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