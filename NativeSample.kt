public class NativeSample {
  init {
    System.loadLibrary("hello")
//    System.load("/Users/alexnew/upWork/Zano/android/example/libhello.so")
  }
  external fun sayHello()
}
