fun main() {
    val nomorstring = listOf("Siji","Loro","Telo")
    println(nomorstring)
    println(nomorstring.joinToString())

    val liststring = StringBuffer("list dari nomor :")
    println(nomorstring.joinTo(liststring))
    println(nomorstring.joinToString(separator = " | ", prefix = "Start :", postfix = ": end"))
}