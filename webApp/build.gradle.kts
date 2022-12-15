plugins {
    kotlin("js")
}

dependencies {
    implementation(project(":shared"))
    implementation(enforcedPlatform("org.jetbrains.kotlin-wrappers:kotlin-wrappers-bom:1.0.0-pre.457"))
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-router-dom")
}

kotlin {
    js(IR) {
        browser {
            commonWebpackConfig {
                cssSupport {
                    enabled = true
                }
            }
        }
        binaries.executable()
    }
}