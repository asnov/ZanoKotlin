fun main() {
  NativeSample().sayHello()

//  val version = Wallet().version()
//  print("version:$version")

//  val res = Wallet().answer()
//  print("answer:${res}")

  val version = plain_wallet().get_version()
  print("version:$version")
}
