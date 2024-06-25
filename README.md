
https://www.upwork.com/jobs/~015425f5df85ec7da4

The android package should be distributed via gradle (maven or jitpack should be fine).
build_android_libs.sh
android libs require to have ndk 26.2.11394342 located in default location.

Kotlin: how to call .a library
- [ ] https://kotlinlang.org/docs/native-c-interop.html
- [x] https://matt-moore.medium.com/kotlin-jni-for-native-code-835e93af7ddf Kotlin JNI for Native Code: How to call native code from Kotlin.

tools:
- kotlinc-native
- **cinterop**
- klib
- kotlinc-jvm /opt/homebrew/bin/kotlinc-jvm

JNI = Java Native Interface


`sudo find / -type f -name kotlinc-native 2>&1 | grep -v -e "Permission denied" -e "Operation not permitted" -e "No such file or directory" -e "Not a directory"`
~/.konan/kotlin-native-prebuilt-macos-aarch64-1.8.20/bin/kotlinc-native
~/.konan/kotlin-native-prebuilt-macos-aarch64-1.8.21/bin/kotlinc-native
~/.konan/kotlin-native-prebuilt-macos-aarch64-1.9.0/bin/kotlinc-native
~/coding/kotlin/native/kotlin-native-macos-aarch64-1.8.20/bin/kotlinc-native
`sudo find / -type f -name klib 2>&1 | grep -v -e "Permission denied" -e "Operation not permitted" -e "No such file or directory" -e "Not a directory"`
~/.konan/kotlin-native-prebuilt-macos-aarch64-1.8.20/bin/klib
~/.konan/kotlin-native-prebuilt-macos-aarch64-1.8.21/bin/klib
~/.konan/kotlin-native-prebuilt-macos-aarch64-1.9.0/bin/klib
~/coding/kotlin/native/kotlin-native-macos-aarch64-1.8.20/bin/klib

`kotlinc-jvm -include-runtime -d NativeSample.jar *.kt`
`gcc hello.c -o libhello.jnilib -shared -fPIC -I /Library/Java/JavaVirtualMachines/zulu-17.jdk/Contents/Home/include -I /Library/Java/JavaVirtualMachines/zulu-17.jdk/Contents/Home/include/darwin`


`sudo find / -type f -name jni.h 2>&1 | grep -v -e "Permission denied" -e "Operation not permitted" -e "No such file or directory" -e "Not a directory"`
/usr/local/lib/node_modules/react-native/ReactAndroid/src/main/jni/first-party/jni-hack/real/jni.h
/usr/local/lib/node_modules/react-native/ReactAndroid/src/main/jni/first-party/jni-hack/jni.h
~/Library/Java/JavaVirtualMachines/temurin-8.jdk/Contents/Home/include/jni.h
~/Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home/include/jni.h
~/Library/Java/JavaVirtualMachines/zulu-17.jdk/Contents/Home/include/jni.h
~/Library/Java/JavaVirtualMachines/jdk-20.jdk/Contents/Home/include/jni.h
~/Library/Java/JavaVirtualMachines/microsoft-11.jdk/Contents/Home/include/jni.h
~/Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home/include/jni.h
~/Library/Java/JavaVirtualMachines/openjdk-20.0.1/Contents/Home/include/jni.h
~/Library/Java/JavaVirtualMachines/corretto-11.0.20/Contents/Home/include/jni.h
~/Library/Java/JavaVirtualMachines/jbr-17.0.7/Contents/Home/include/jni.h
~/Library/Java/JavaVirtualMachines/corretto-19.0.2/Contents/Home/include/jni.h
~/Library/Java/JavaVirtualMachines/corretto-18.0.2/Contents/Home/include/jni.h
~/Library/Java/JavaVirtualMachines/azul-11.0.22/Contents/Home/include/jni.h
~/Library/Android/sdk/ndk/26.2.11394342/toolchains/llvm/prebuilt/darwin-x86_64/sysroot/usr/include/jni.h
~/Library/Android/sdk/ndk/25.1.8937393/toolchains/llvm/prebuilt/darwin-x86_64/sysroot/usr/include/jni.h
~/Library/Android/sdk/ndk-bundle/toolchains/llvm/prebuilt/darwin-x86_64/sysroot/usr/include/jni.h
~/StudioProjects/Telegram/TMessagesProj/jni/ffmpeg/include/libavcodec/jni.h
~/Applications/PyCharm Professional Edition.app/Contents/jbr/Contents/Home/include/jni.h
~/Applications/IntelliJ IDEA Ultimate.app/Contents/jbr/Contents/Home/include/jni.h
~/Applications/WebStorm.app/Contents/jbr/Contents/Home/include/jni.h
~/Applications/AppCode.app/Contents/jbr/Contents/Home/include/jni.h
~/.gradle/jdks/adoptium-11-aarch64-hotspot-mac/jdk-11.0.19+7/Contents/Home/include/jni.h
~/.gradle/jdks/azul_systems__inc_-8-aarch64-os_x/zulu8.72.0.17-ca-jdk8.0.382-macosx_aarch64/zulu-8.jdk/Contents/Home/include/jni.h
/opt/homebrew/Cellar/openjdk/22.0.1/libexec/openjdk.jdk/Contents/Home/include/jni.h
~/Library/Android/sdk/ndk/26.2.11394342/toolchains/llvm/prebuilt/darwin-x86_64/sysroot/usr/include/jni.h
~/Library/Android/sdk/ndk/25.1.8937393/toolchains/llvm/prebuilt/darwin-x86_64/sysroot/usr/include/jni.h
~/Library/Android/sdk/ndk-bundle/toolchains/llvm/prebuilt/darwin-x86_64/sysroot/usr/include/jni.h

`sudo find / -type d -name "*-openjdk-*" 2>&1 | grep -v -e "Permission denied" -e "Operation not permitted" -e "No such file or directory" -e "Not a directory"`


`lipo -info libhello.so`
Non-fat file: libhello.so is architecture: arm64

`java -jar NativeSample.jar`
`java -jar -Djava.library.path=. NativeSample.jar`
Exception in thread "main" java.lang.UnsatisfiedLinkError: no hello in java.library.path
- [x] https://stackoverflow.com/questions/761639/why-am-i-getting-this-unsatisfiedlinkerror-with-native-code
`mv libhello.so libhello.jnilib` helped


