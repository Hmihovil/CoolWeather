object Versions {
    val androidGradle = "3.3.0-rc01"
    val kotlin = "1.3.10"
    val constraintLayout = "2.0.0-alpha2"
    val coroutines = "1.0.0"
    val support = "1.0.2"
    val navigation = "1.0.0-alpha07"
    val lifecycle = "2.0.0"
    val dagger = "2.19"
    val room = "2.0.0"
    val retrofit = "2.5.0"
    val moshi = "1.8.0"
    val glide = "4.8.0"
    val retrofitCoroutinesAdapter = "0.9.2"
    val junit = "4.12"
    val testRunner = "1.1.0"
    val espresso = "3.1.0"
    val material = "1.0.0"
}
/*




    implementation "com.github.bumptech.glide:glide:$glide_version"
    kapt "com.github.bumptech.glide:compiler:$glide_version"

    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test:runner:1.1.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0")
 */


object Libs {
    val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradle}"
    val navigationGradlePlugin = "android.arch.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
    val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val appCompat = "androidx.appcompat:appcompat:${Versions.support}"
    val coreCtx = "androidx.core:core-ktx:${Versions.support}"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    val lifecycleExt = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    val lifecycleRx = "androidx.lifecycle:lifecycle-reactivestreams-ktx:${Versions.lifecycle}"
    val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"
    val navigationFragmentKtx = "android.arch.navigation:navigation-fragment-ktx:${Versions.navigation}"
    val navigationUiKtx = "android.arch.navigation:navigation-ui-ktx:${Versions.navigation}"
    val material = "com.google.android.material:material:${Versions.material}"
    val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    val roomRx = "androidx.room:room-rxjava2:${Versions.room}"
    val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    val coroutinesRx2 = "org.jetbrains.kotlinx:kotlinx-coroutines-rx2:${Versions.coroutines}"
    val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    val daggerAndroid = "com.google.dagger:dagger-android:${Versions.dagger}"
    val daggerAndroidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    val daggerAndroidProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
    val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofitMoshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    val retrofitCouroutines = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.retrofitCoroutinesAdapter}"
    val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
    val moshiCodeGen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"
    val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    val glideCompiler =  "com.github.bumptech.glide:compiler:${Versions.glide}"
    val junit = "junit:junit:${Versions.junit}"
    val testRunner = "androidx.test:runner:${Versions.testRunner}"
    val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}

