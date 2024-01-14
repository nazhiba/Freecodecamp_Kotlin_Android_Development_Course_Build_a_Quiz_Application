//Pemilu 2024
fun main() {
    val users = mutableMapOf<Int, String>(1 to "Anies", 2 to "Prabowo", 3 to "ganjar")
    println(users[1])
    users[4] = "Nadzib"
    users.remove(4)
    users.forEach{
        t,u ->
        println("$t adalah $u")
    }
}