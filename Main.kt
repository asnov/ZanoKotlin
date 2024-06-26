fun main() {
  NativeSample().sayHello()

  val version = Wallet().version()
  print("version:$version")
}
