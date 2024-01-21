fun main() {
    val nomer1 = 1
    val nomer2 = 2
    if (nomer1<1.2 || nomer2>1.2){
        println("++++ ----- ++++")
    }else{
        println("lupa persamaan kuadrat")
    }

    val lebihsimpel = if (nomer1<1.2 || nomer2>1.2) "++++ ----- ++++" else "lupa persamaan kuadrat"
    println("$lebihsimpel")

    if (nomer1 == 1) println("Amin") else println("Bukan Amin")
    if (nomer2 == 2) println("Papa") else println("Bukan Papa")


}