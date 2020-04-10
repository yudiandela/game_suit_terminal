class Player(text: String = "", nama: String = "", var pilihan: String = "") : Human(text, nama) {
    init {
        print("Silahkan input pilihan $text : ")
        pilihan = readLine().toString().toUpperCase()
    }
}