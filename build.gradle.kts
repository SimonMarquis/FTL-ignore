import com.android.build.gradle.LibraryExtension
import com.android.tools.firebase.testlab.gradle.TestLabGradlePlugin
import com.google.firebase.testlab.gradle.TestLabGradlePluginExtension
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("com.android.application") version "8.2.1" apply false
    id("com.android.library") version "8.2.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
    id("com.google.firebase.testlab") version "0.0.1-alpha05" apply false
}

subprojects {
    apply<TestLabGradlePlugin>()
    afterEvaluate {
        extensions.configure<LibraryExtension> {
            compileSdk = 34

            defaultConfig {
                minSdk = 24
                testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
            }
            compileOptions {
                sourceCompatibility = JavaVersion.VERSION_11
                targetCompatibility = JavaVersion.VERSION_11
            }
            tasks.withType<KotlinCompile> {
                compilerOptions.jvmTarget.set(JvmTarget.JVM_11)
            }
        }
        dependencies {
            add("testImplementation", "junit:junit:4.13.2")
            add("androidTestImplementation", "androidx.test.ext:junit:1.1.5")
            add("androidTestImplementation", "androidx.test:runner:1.5.2")
        }
        extensions.configure<TestLabGradlePluginExtension> {
            serviceAccountCredentials.set(rootProject.layout.projectDirectory.file("serviceAccountCredentials.json"))
            managedDevices.create("ftlDevice") {
                device = "MediumPhone.arm"
                apiLevel = 34
            }
        }
    }
}