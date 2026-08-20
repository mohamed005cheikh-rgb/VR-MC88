# Add project specific ProGuard rules here.

# Keep Kotlin coroutines
-keep class kotlinx.coroutines.** { *; }
-dontwarn kotlinx.coroutines.**

# Keep Bluetooth classes
-keep class android.bluetooth.** { *; }
-dontwarn android.bluetooth.**

# Keep Kotlin Metadata
-keepattributes *Annotation*
-keepattributes InnerClasses
-keepattributes Signature
-keepattributes EnclosingMethod

# Keep Material Design components
-keep class com.google.android.material.** { *; }
-dontwarn com.google.android.material.**
