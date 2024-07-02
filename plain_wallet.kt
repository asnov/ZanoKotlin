class plain_wallet {
    init {
        System.loadLibrary("wallet")
    }
    external fun get_version(): String
}
