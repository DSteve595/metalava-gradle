plugins {
    id("com.android.library")
    alias(libs.plugins.metalavaGradle)
}

android {
    compileSdk = 31

    defaultConfig {
        minSdk = 21
        targetSdk = 30
    }
}

metalava {
    filename = "api/$name-api.txt"
}
