fun main() {

    println("=======================================")
    println("GAME SUIT TERMINAL VERSION")
    println("=======================================")

    var pemain1: Player = Player("Pemain 1")
    var pemain2: Player = Player("Pemain 2")

//    println("Nama ${pemain1.text} adalah ${pemain1.nama}")
//    println("Pilihan ${pemain1.text} adalah ${pemain1.pilihan}")
//
//    println("=======================================")
//    println("Nama ${pemain2.text} adalah ${pemain2.nama}")
//    println("Pilihan ${pemain2.text} adalah ${pemain2.pilihan}")

    println("=======================================")
    println("Hasil:")
    if(pemain1.pilihan == "BATU" && pemain2.pilihan == "GUNTING") {
        println("${pemain1.text} MENANG!")
    }

    if(pemain1.pilihan == "KERTAS" && pemain2.pilihan == "BATU") {
        println("${pemain1.text} MENANG!")
    }

    if(pemain1.pilihan == "GUNTING" && pemain2.pilihan == "KERTAS") {
        println("${pemain1.text} MENANG!")
    }

    if(pemain1.pilihan == pemain2.pilihan) {
        println("Draw!")
    }


    if(pemain2.pilihan == "BATU" && pemain1.pilihan == "GUNTING") {
        println("${pemain2.text} MENANG!")
    }

    if(pemain2.pilihan == "KERTAS" && pemain1.pilihan == "BATU") {
        println("${pemain2.text} MENANG!")
    }

    if(pemain2.pilihan == "GUNTING" && pemain1.pilihan == "KERTAS") {
        println("${pemain2.text} MENANG!")
    }
}