 plugins {
    java
    
    application
    
    id("com.github.johnrengelman.shadow") version "7.0.0" // Update the version!
}

application {
    mainClass.set("it.unibo.design.robot.test.TestComposableRobot")
}

repositories {
    mavenCentral()
}

dependencies {
    val junitVersion = "5.9.1"
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testImplementation("org.junit.jupiter:junit-jupiter-params:$junitVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}

tasks.test {
    useJUnitPlatform()
    
    testLogging.showStandardStreams = true
}
