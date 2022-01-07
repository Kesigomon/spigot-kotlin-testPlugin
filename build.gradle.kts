plugins {
    kotlin("jvm") version "1.6.10"
    id("com.github.johnrengelman.shadow") version "5.0.0"
}

group = "com.kesigomon"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    compileOnly("org.spigotmc:spigot-api:1.16.3-R0.1-SNAPSHOT")
    compileOnly("org.spigotmc:spigot-api:1.17-R0.1-SNAPSHOT")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}


tasks.withType<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar> {
    manifest{
        attributes["Main-Class"]  = "com.kesigomon.tutorialPlugin.TutorialPlugin"
    }
    val version = archiveVersion.orNull
    archiveFileName.set(
        "testPlugin-$version.jar"
    )
}