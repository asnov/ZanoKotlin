#!/usr/bin/env bash
kotlinc-jvm -include-runtime -d NativeSample.jar *.kt
gcc hello.c -o libhello.jnilib -shared -fPIC -I /Library/Java/JavaVirtualMachines/zulu-17.jdk/Contents/Home/include -I /Library/Java/JavaVirtualMachines/zulu-17.jdk/Contents/Home/include/darwin
java -jar NativeSample.jar
