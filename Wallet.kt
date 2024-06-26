public class Wallet {
    init {
        System.loadLibrary("wallet")
//        System.load("/Users/alexnew/upWork/Zano/android/ZanoKotlin/_install_android/x86/lib/libwallet.a")
    }
    external fun version()
}
