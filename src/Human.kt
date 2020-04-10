open class Human(final override var text: String, final override var nama: String) : HumanInterface {
    init {
        this.play()
    }

    fun play() {
        print("Silahkan input nama $text : ")
        nama = readLine().toString()
    }
}