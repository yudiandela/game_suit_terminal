open class Human(final override var text: String, final override var nama: String): HumanInterface {
    init {
        print("Silahkan input nama $text : ")
        nama = readLine().toString()
    }
}