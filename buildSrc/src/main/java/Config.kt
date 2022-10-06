object Versions {
    const val androidGradlePlugin       = "7.1.3"
    const val kotlinGradlePlugin        = "1.6.20"
    const val navGradlePlugin           = "2.3.5"
    const val hiltGradlePlugin          = "2.42"

    const val kotlin                    = "1.6.20"
    const val navigationArgs            = "2.3.5"
    const val room                      = "2.3.0"
    const val lifecycleArch             = "1.1.1"
    const val lifecycle                 = "2.5.1"
    const val paging                    = "3.1.1"
    const val coroutines                = "1.5.1-native-mt"
    const val recyclerView              = "1.2.0"
    const val swipeRefreshLayout        = "1.1.0"
    const val material                  = "1.7.0-alpha02"
    const val cardView                  = "1.0.0"
    const val appCompat                 = "1.6.0-alpha01"
    const val activity                  = "1.4.0"
    const val legacy                    = "1.0.0"
    const val activityKtx               = "1.4.0"
    const val constraintLayout          = "2.0.4"
    const val androidX                  = "1.6.0"
    const val coreKtx                   = "1.6.0"
    const val fragment                  = "1.3.5"

    const val hilt                      = "2.42"
    const val retrofit                  = "2.9.0"
    const val retrofitCoroutinesAdapter = "0.9.2"
    const val okhttp                    = "5.0.0-alpha.2"
    const val gson                      = "2.8.7"
    const val androidAnnotations        = "29.0.1"
    const val glide                     = "4.13.0"
    const val glideCompiler             = "4.12.0"
    const val workRunTime               = "2.7.0-alpha05"
    const val shimmer                   = "0.5.0"
    const val enthuaShimmer             = "1.1.2"
    const val ioSuperCShimmer           = "2.1.0"
    const val circleImageView           = "3.1.0"
    const val loopJAsync                = "1.4.11"
    const val chucker                   = "3.5.0"
    const val runtimePermission         = "1.1.2"
    const val dagger                    = "2.38.1"

    //test
    const val jUnit                     = "4.12"
    const val espresso                  = "3.4.0"
    const val testRunner                = "1.2.0"
    const val assertJ                   = "3.8.0"
    const val mockito                   = "2.8.47"
    const val jUnitExt                  = "1.1.3"
    const val mockk                     = "1.10.0"
    const val robolectric               = "4.4"
    const val fragmentTest              = "1.2.5"
    const val coreTest                  = "2.1.0"
}

object AndroidConfig {
    const val androidBuildToolsVersion  = "30.0.3"
    const val androidMinSdkVersion      = 23
    const val androidTargetSdkVersion   = 31
    const val androidCompileSdkVersion  = 31
    const val androidAppId              = "id.flare"
}

object Release {
    const val androidVersionCode        = 1
    const val androidVersionName        = "1.0.0"
}

object BuildPlugins {
    const val androidGradlePlugin      = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"
    const val kotlinGradlePlugin       = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinGradlePlugin}"
    const val navGradlePlugin          = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navGradlePlugin}"
    const val hiltGradlePlugin         = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hiltGradlePlugin}"
}

object KotlinDependencies {
    const val kotlinStdLibs            = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val kotlinExtensions         = "org.jetbrains.kotlin:kotlin-android-extensions-runtime:${Versions.kotlin}"
    const val coroutines               = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val coroutinesCore           = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
}

object AndroidCommonDependencies {
    const val navigationFragment       = "androidx.navigation:navigation-fragment-ktx:${Versions.navigationArgs}"
    const val navigationUi             = "androidx.navigation:navigation-ui-ktx:${Versions.navigationArgs}"

    const val roomCompiler             = "androidx.room:room-compiler:${Versions.room}"
    const val room                     = "androidx.room:room-runtime:${Versions.room}"
    const val roomRxJava               = "androidx.room:room-rxjava2:${Versions.room}"
    const val roomCommon               = "androidx.room:room-common:${Versions.room}"
    const val roomKtx                  = "androidx.room:room-ktx:${Versions.room}"

    const val lifecycle                = "android.arch.lifecycle:extensions:${Versions.lifecycleArch}"
    const val lifecycleVM              = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val lifecycleVMSavedState    = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifecycle}"
    const val lifecycleReactive        = "androidx.lifecycle:lifecycle-reactivestreams-ktx:${Versions.lifecycle}"
    const val lifecycleLiveData        = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val lifecycleProcess         = "androidx.lifecycle:lifecycle-process:${Versions.lifecycle}"
    const val lifecycleRuntime         = "androidx.lifecycle:lifecycle-runtime:${Versions.lifecycle}"
    const val lifecycleRuntimeKtx      = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val lifecycleCommonJava8     = "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle}"
    const val lifecycleCompiler        = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"

    const val appcompat                = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val cardView                 = "androidx.cardview:cardview:${Versions.cardView}"
    const val constraint               = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val recyclerview             = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
    const val support                  = "androidx.legacy:legacy-support-v4:${Versions.androidX}"
    const val swipeRefreshLayout       = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swipeRefreshLayout}"
    const val core                     = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val pagingCommon             = "androidx.paging:paging-common-ktx:${Versions.paging}"
    const val activityKtx              = "androidx.activity:activity-ktx:${Versions.activityKtx}"

    const val fragment                 = "androidx.fragment:fragment:${Versions.fragment}"
    const val androidActivity          = "androidx.activity:activity:${Versions.activity}"
    const val legacySupport            = "androidx.legacy:legacy-support-v4:${Versions.legacy}"
    const val material                 = "com.google.android.material:material:${Versions.material}"
    const val workRunTime              = "androidx.work:work-runtime:${Versions.workRunTime}"
}

object ExternalLibraryDependencies {
    const val retrofit                 = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitAdapter          = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val retrofitConverterGson    = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val retrofitMoshiConverter   = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    const val retrofitCoroutineAdapter = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.retrofitCoroutinesAdapter}"

    const val okhttp                   = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
    const val okhttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
    const val okHttpMockWebServer      = "com.squareup.okhttp3:mockwebserver:${Versions.okhttp}"

    const val dagger                   = "com.google.dagger:dagger:${Versions.dagger}"
    const val daggerCompiler           = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val daggerAndroid            = "com.google.dagger:dagger-android:${Versions.dagger}"
    const val daggerAndroidSupport     = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    const val daggerAnnotationProcessor= "com.google.dagger:dagger-android-processor:${Versions.dagger}"

    const val gson                     = "com.google.code.gson:gson:${Versions.gson}"
    const val androidAnnotations       = "com.android.support:support-annotations:${Versions.androidAnnotations}"
    const val glide                    = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glideCompiler            = "com.github.bumptech.glide:compiler:${Versions.glideCompiler}"

    const val hiltAndroid              = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompilerAndroid      = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val shimmer                  = "com.facebook.shimmer:shimmer:${Versions.shimmer}"

    const val loopjAsync               = "com.loopj.android:android-async-http:${Versions.loopJAsync}"
    const val enthuaSkeleton           = "com.ethanhua:skeleton:${Versions.enthuaShimmer}"
    const val shimmerIoSuperCharge     = "io.supercharge:shimmerlayout:${Versions.ioSuperCShimmer}"
    const val runtimePermission        = "com.github.florent37:RuntimePermission:v${Versions.runtimePermission}"

    const val chucker                  = "com.github.chuckerteam.chucker:library:${Versions.chucker}"
    const val chuckerNoOp              = "com.github.chuckerteam.chucker:library-no-op:${Versions.chucker}"
}

object TestDependencies {
    const val jUnit                    = "junit:junit:${Versions.jUnit}"
    const val espresso                 = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val testRunner               = "androidx.test:runner:${Versions.testRunner}"
    const val assertj                  = "org.assertj:assertj-core:${Versions.assertJ}"
    const val mockito                  = "org.mockito:mockito-core:${Versions.mockito}"
    const val mockitoInline            = "org.mockito:mockito-inline:${Versions.mockito}"
    const val coreTest                 = "androidx.arch.core:core-testing:${Versions.coreTest}"
    const val coroutinesTest           = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    const val fragmentTest             = "androidx.fragment:fragment-testing:${Versions.fragmentTest}"
    const val jUnitExt                 = "androidx.test.ext:junit:${Versions.jUnitExt}"
    const val hiltTest                 = "com.google.dagger:hilt-android-testing:${Versions.dagger}"
    const val mockk                    = "io.mockk:mockk:${Versions.mockk}"
    const val mockkAndroid             = "io.mockk:mockk-android:${Versions.mockk}"
    const val robolectric              = "org.robolectric:robolectric:${Versions.robolectric}"
    const val pagingRunTime            = "androidx.paging:paging-runtime:${Versions.paging}"
}