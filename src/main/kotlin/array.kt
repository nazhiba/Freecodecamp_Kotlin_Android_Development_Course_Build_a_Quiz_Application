fun main() {
    val nama = arrayOf("Anies", "Prabowo", "Ganjar")
    nama[0] = "Nadzib"
    println("Yang mana? : ${nama[0]}")
    println("Banyaknya caper adalah : ${nama[0]}")


    for (i in nama){
        if (i is String){
            println(i)
        }
    }
}