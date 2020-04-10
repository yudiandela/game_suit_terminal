fun main() {
    println("=======================================")
    println("GAME SUIT TERMINAL VERSION")
    println("=======================================")

    val pemain1: Player = Player("Pemain 1")
    val pemain2: Player = Player("Pemain 2")

    println("=======================================")
    println("Hasil:")
    if (
        (pemain1.pilihan == "BATU" && pemain2.pilihan == "GUNTING") ||
        (pemain1.pilihan == "KERTAS" && pemain2.pilihan == "BATU") ||
        (pemain1.pilihan == "GUNTING" && pemain2.pilihan == "KERTAS")
    ) {
        println("${pemain1.nama} sebagai ${pemain1.text} MENANG!")
    } else if (pemain1.pilihan == pemain2.pilihan) {
        println("Permainan Draw!")
    } else {
        println("${pemain2.nama} sebagai ${pemain2.text} MENANG!")
    }
}