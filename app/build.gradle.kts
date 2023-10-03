plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.sharesphere"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.sharesphere"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    lintOptions {
        disable("RestrictedApi")
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")


    implementation("com.google.firebase:firebase-firestore-ktx:24.8.1")


    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.9.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9")
    api ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")
    api ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9")


    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.android.material:material:1.9.0")


    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.1.1")



    implementation(platform("com.google.firebase:firebase-bom:32.3.1"))

    implementation ("com.google.firebase:firebase-firestore")
    implementation ("com.google.firebase:firebase-auth-ktx")
    implementation ("com.firebaseui:firebase-ui-firestore:7.2.0")



    // Also add the dependency for the Google Play services library and specify its version
    implementation("com.google.android.gms:play-services-auth:20.7.0")




    // Also add the dependency for the Google Play services library and specify its version
    implementation("com.google.android.gms:play-services-auth:20.7.0")

    implementation ("com.google.android.gms:play-services-auth:19.0.0")


    implementation("com.google.firebase:firebase-storage-ktx:20.2.1")
    implementation ("com.github.bumptech.glide:glide:4.14.2")
    // Skip this if you don't want to use integration libraries or configure Glide.
    annotationProcessor ("com.github.bumptech.glide:compiler:4.14.2")


    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")


    androidTestImplementation ("androidx.arch.core:core-testing:2.2.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1") {
        exclude(group = "com.android.support", module = "support-annotations")
    }

}