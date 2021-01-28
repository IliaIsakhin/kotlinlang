plugins {
    kotlin("jvm") version "1.4.10"
    
    id("me.champeau.gradle.jmh") version "0.5.2"
}

group = "com.epam"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:1.4.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor:1.4.1")
    implementation("io.projectreactor.kotlin:reactor-kotlin-extensions:1.1.1")
    implementation("org.mockito:mockito-all:1.10.19")

    compileOnly("org.projectlombok:lombok:1.18.12")
    annotationProcessor("org.projectlombok:lombok:1.18.12")
}
