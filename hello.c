#include <stdio.h>
#include "NativeSample.h"
JNIEXPORT void JNICALL Java_NativeSample_sayHello(JNIEnv *env, jobject obj) {
  printf("Hello World!\n");
  return;
}
