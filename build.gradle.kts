plugins {
    kotlin("jvm") version "2.3.0"
}

group = "net.perfect.tea.magiquecube"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    implementation("org.slf4j:slf4j-api:2.0.12")
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}