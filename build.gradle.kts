buildscript {
  repositories {
    jcenter()
    google()
    mavenCentral()
  }
  dependencies {
    classpath("com.android.tools.build:gradle:7.0.2")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21")
    classpath("com.vanniktech:gradle-maven-publish-plugin:0.15.0")
    classpath("org.jetbrains.dokka:dokka-gradle-plugin:1.4.10.2")
  }
}

allprojects {
  repositories {
    jcenter()
    google()
    mavenCentral()
  }
}

tasks.register("clean", Delete::class) {
  delete(rootProject.buildDir)
}
