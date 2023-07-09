plugins {
    application
    java
    id("org.springframework.boot") version "3.1.0"
    id ("io.spring.dependency-management") version "1.0.11.RELEASE"
}

application {
    mainClass.set("org/gradleproj/Main")
}

group = "org.gradleproj"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation ("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.test {
    useJUnitPlatform()
}

java.sourceSets["main"].apply {
    java.setSrcDirs(listOf("src/main/java"))
    resources.setSrcDirs(listOf("src/main/resources"))
}

tasks.jar {
    destinationDirectory.set(layout.buildDirectory.dir("output"))
}
