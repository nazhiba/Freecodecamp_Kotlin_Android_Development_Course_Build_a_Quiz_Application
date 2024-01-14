fun main() {
    val nomor = setOf(1,2,3,4,5)
    println(nomor.map { if (it == 3) it * 10 else it * 100 })
    val kunci = mapOf("Jawa 1" to 1, "jawa 2" to 2, "jawa 3" to 3, "Jawa adalah" to 1)
    println(kunci.mapKeys { it.key.uppercase() })
    println(kunci.mapValues { it.value * it.key.length })

    //zipping
    val colors = listOf("red","green","blue")
    val c = listOf("R","G","B")
    println(colors zip c)
    println(colors.zip(c){colors,c -> "The ${c.replaceFirstChar { it.uppercase() }} is $colors"})

    val nomer = listOf("siji" to 1,"loro" to 2, "telu" to 3)
    println(nomer)
    println(nomer.unzip())
}