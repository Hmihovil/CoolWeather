plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(28)
    defaultConfig {
        applicationId = "com.akoufatzis.coolweather"
        minSdkVersion(21)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    // implementation fileTree(dir: "libs", include: ["*.jar"])
    implementation(Libs.kotlinStdLib)
    implementation(Libs.appCompat)
    implementation(Libs.constraintLayout)

    implementation(Libs.viewModelKtx)
    implementation(Libs.lifecycleExt)
    implementation(Libs.lifecycleRx)
    kapt(Libs.lifecycleCompiler)

    implementation(Libs.navigationFragmentKtx)
    implementation(Libs.navigationUiKtx)

    implementation(Libs.material)

    implementation(Libs.roomRuntime)
    implementation(Libs.roomRx)
    kapt(Libs.roomCompiler)

    implementation(Libs.coroutinesCore)
    implementation(Libs.coroutinesAndroid)
    implementation(Libs.coroutinesRx2)

    implementation(Libs.dagger)
    implementation(Libs.daggerAndroid)
    implementation(Libs.daggerAndroidSupport)
    kapt(Libs.daggerAndroidProcessor)
    kapt(Libs.daggerCompiler)

    implementation(Libs.retrofit)
    implementation(Libs.retrofitMoshi)
    implementation(Libs.retrofitCouroutines)

    implementation(Libs.moshi)
    kapt(Libs.moshiCodeGen)

    implementation(Libs.glide)
    kapt(Libs.glideCompiler)

    testImplementation(Libs.junit)
    androidTestImplementation(Libs.testRunner)
    androidTestImplementation(Libs.espresso)
}
