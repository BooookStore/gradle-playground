buildscript {
    dependencies {
        classpath(files("build/libs/gradle-custom-type-task-standalone.jar"))
    }
}

plugins {
    groovy
}

dependencies {
    implementation(gradleApi())
    implementation(localGroovy())
}

tasks.register<org.gradle.GreetingTask>("greeting") {
    greeting = "howdy!"
}