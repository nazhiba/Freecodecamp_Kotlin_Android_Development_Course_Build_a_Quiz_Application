fun main(args : Array<String>) {
    val name = mutableListOf("Nama 1", "nama 2", "nama 3", "nama 4")
    name.add("Nama baru 5")
//    println(name[4])
    name.removeAt(0)
    name.forEach{ println(it) }
}