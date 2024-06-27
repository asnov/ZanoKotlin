fun main() {
  NativeSample().sayHello()

  val version = Wallet().version()
  print("version:$version")



  val res = answer()
  print("answer:${res}")
}
