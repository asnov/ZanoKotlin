
https://www.upwork.com/jobs/~015425f5df85ec7da4

The android package should be distributed via gradle (maven or jitpack should be fine).
build_android_libs.sh
android libs require to have ndk 26.2.11394342 located in default location.


**24/06/2024** 16:00-19:00 3hrs

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

```bash
kotlinc-jvm -include-runtime -d NativeSample.jar *.kt
gcc hello.c -o libhello.jnilib -shared -fPIC -I /Library/Java/JavaVirtualMachines/zulu-17.jdk/Contents/Home/include -I /Library/Java/JavaVirtualMachines/zulu-17.jdk/Contents/Home/include/darwin
```

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
-

`lipo -info libhello.so`
Non-fat file: libhello.so is architecture: arm64

```bash
java -jar NativeSample.jar
java -jar -Djava.library.path=. NativeSample.jar
```

Exception in thread "main" java.lang.UnsatisfiedLinkError: no hello in java.library.path
- [x] https://stackoverflow.com/questions/761639/why-am-i-getting-this-unsatisfiedlinkerror-with-native-code
  `mv libhello.so libhello.jnilib` helped

- [ ] https://github.com/asnov/ZanoKotlin/packages
  JNI


**25/06/2024** 12:00-13:00, 16:00-18:00 3hrs
- [ ] https://developer.android.com/ndk/index.html
- [ ] https://github.com/googlesamples/android-ndk
  - [ ] https://github.com/android-ndk/ndk/issues/new

how to create and publish gradle package
- [ ] 

gradle kotlin publishing
- [ ] https://stackoverflow.com/questions/71181790/how-do-you-publish-a-kotlin-artifact-to-maven-central
- [ ] 

not a mach-o file
- [x] https://en.wikipedia.org/wiki/Mach-O
  - [x] https://sourceforge.net/projects/machoview/
  - ~/upWork/Zano/machoview-code
  - find . -name "*.mm" -exec wc -l {} \;
  - **18609** lines of code en total
- [ ] .
  File formats: \*.a, mach-o,
  Utils:
- file - – determine file type
- ar – create and maintain library archives
- ranlib (xcode toolchain) - add or update the table of contents of archive libraries
- lipo (xcode toolchain) - create or operate on universal files
- otool (xcode toolchain) - object file displaying tool
- objdump - llvm object file dumper
- libtool (xctoolchain) - create libraries
- ranlib (xctoolchain) - add or update the table of contents of archive libraries


`find zano_native_lib -type f -name "*.a" -exec file {} \;`
242 files
`find zano_native_lib -type f -name "*.a" -exec file {} \; | grep Mach`
zano_native_lib/_install_ios/lib/lib**wallet**.a.xcframework/ios-arm64_x86_64-simulator/lib**wallet**.a
zano_native_lib/_install_ios/arm64_x86_64_simulator_temp/lib/lib**wallet**.a

**Error:** (file does not start with MH_MAGIC[_64], file does not start with MH_MAGIC[_64], fat file, but missing compatible architecture (have 'x86_64,arm64', need 'arm64e' or 'arm64'))

current ar archive random library vs current ar archive
- [x] https://softwareengineering.stackexchange.com/questions/389383/what-is-the-difference-between-a-static-library-and-an-archive-library
```bash
echo "int answer() { return 42; }" > answer.cpp
c++ -c answer.cpp -o answer.o
ar -r libanswer.a answer.o
ar -tv libanswer.a
```

`file libhello.jnilib`
libhello.jnilib: Mach-O 64-bit dynamically linked shared library arm64
`file libwallet.jnilib`
libwallet.jnilib: Mach-O universal binary with 2 architectures: \[x86_64:current ar archive] \ [arm64]
libwallet.jnilib (for architecture x86_64): current ar archive
libwallet.jnilib (for architecture arm64): current ar archive


**26/06/2024** 11:00-13:00, 16:00-17:00 3hrs

- [ ] https://softwareengineering.stackexchange.com/questions/389383/what-is-the-difference-between-a-static-library-and-an-archive-library
  - [x] https://en.wikipedia.org/wiki/Ar_(Unix)#Example_usage
  - [x] https://softwareengineering.stackexchange.com/questions/313907/should-i-add-the-source-of-libraries-instead-of-linking-to-them/369128#369128
- [ ] 

(unloadable mach-o file type 1 './libanswer.jnilib')
(not a mach-o file)

`file answer.o`
answer.o: Mach-O 64-bit object arm64
`file libanswer.a`
libanswer.a: current ar archive random library
`file libanswer.jnilib`
libanswer.jnilib: Mach-O 64-bit dynamically linked shared library arm64
`file ../libanswer.jnilib`
../libanswer.jnilib: current ar archive random library

Exception in thread "main" java.lang.UnsatisfiedLinkError: 'int MainKt.answer()'

`gcc answer.cpp -o libanswer.jnilib -shared -fPIC -I /Library/Java/JavaVirtualMachines/zulu-17.jdk/Contents/Home/include -I /Library/Java/JavaVirtualMachines/zulu-17.jdk/Contents/Home/include/darwin`


**27/06/2024** 10:30-11:30, 20:00-21:00 2hrs

LTO = Link Time Optimization
ld - linker
dsymutil - manipulate archived DWARF debug symbol files

`file answer/libwallet.jnilib`
answer/libwallet.jnilib: Mach-O universal binary with 2 architectures: [x86_64:current ar archive] [arm64]
answer/libwallet.jnilib (for architecture x86_64): current ar archive
answer/libwallet.jnilib (for architecture arm64): current ar archive

file does not start with MH_MAGIC[_64], fat file, but missing compatible architecture (have 'x86_64,arm64', need 'arm64e' or 'arm64')
- [ ] https://stackoverflow.com/questions/69288614/ios-realm-file-does-not-start-with-mh-magic-64-fat-file-but-missing-compati


**28/06/2024**

- KMPProject
  - Tasks
    - compose desktop
      - run
    - kotlin browser
      - wasmJsBrowserRun
    -

Uncaught runtime errors:
×ERROR
WebAssembly.instantiateStreaming(): invalid value type 'anyref', enable with --experimental-wasm-gc @+210 CompileError: WebAssembly.instantiateStreaming(): invalid value type 'anyref', enable with --experimental-wasm-gc @+210


**01/07/2024** 16:30-17:00, 18:30-20:00, 2hrs

- Kotlin multiplatform library
- March 12th, 2024 Maven Central changed the publishing rules and process.
  Maven: How to publish now?

- [ ] https://github.com/Kotlin/multiplatform-library-template barebones library project to quickly bootstrap a Kotlin Multiplatform library, that is deployable to Maven Central.
  - [x] https://central.sonatype.org/faq/what-happened-to-issues-sonatype-org
    - [ ] To register to publish to Maven Central, please follow the instructions in our [Central Portal registration documentation](https://central.sonatype.org/register/central-portal/).
- [ ] https://kotlinlang.org/docs/api-guidelines-backward-compatibility.html # Backward compatibility guidelines for library authors
- [ ] ...

OSSRH = OSS Repository Hosting
OSS = Open Source Software?
POM = Project Object Model
GAV = Group, Artifact, Version coordinate
- [x] https://stackoverflow.com/questions/71835160/what-is-the-meaning-for-gav-in-maven-context
  SCM = source control system


Requirements: https://central.sonatype.org/publish/requirements/
- Supply Javadoc and Sources
- Provide Files Checksums: `.md5` and `.sha1` are required
- Sign Files with GPG/PGP: a `.asc` file containing the signature must be included for each file
- Sufficient Metadata: a `pom` file, include the correct dependencies of your project, so that build tools can use that information to resolve transitive dependencies correctly and your users are not required to manually manage the dependencies.
- Correct Coordinates, GAV: groupId, artifactId, version.
- Project Name, Description and URL
- License Information
- Developer Information
- SCM Information

TODO:
- [x] Register user
- [ ] Register namespace https://central.sonatype.org/register/namespace/
- [ ] Verify Namespace https://central.sonatype.org/faq/publisher-early-access/
  - [x] https://central.sonatype.org/faq/what-is-different-between-central-portal-and-legacy-ossrh/#publishing
    - [x] https://central.sonatype.org/faq/snapshot-releases/
      - Maven Central Portal don't support `-SNAPSHOT` releases.
      - [ ] [Sonatype Nexus Repository](https://www.sonatype.com/products/sonatype-nexus-oss-download) does.
      - [ ] https://help.sonatype.com/en/repository-management.html#maven-snapshots
    - Publishing through Gradle is also not yet officially supported in Central Portal. There are however several [third-party plugins for Gradle](https://central.sonatype.org/publish/publish-portal-gradle)
    - [x] https://central.sonatype.org/publish/publish-portal-gradle/
      - There is no official Gradle plugin for publishing to Maven Central via the Central Publishing Portal.
      - There are Community Plugins.
  - [x] https://central.sonatype.org/faq/verify-ownership/
    - [ ] open a new project request and record your ticket number
    - [ ] configure a DNS TXT record that contains the ticket number
  - [ ] https://central.sonatype.org/faq/how-to-set-txt-record/
- [ ] 







