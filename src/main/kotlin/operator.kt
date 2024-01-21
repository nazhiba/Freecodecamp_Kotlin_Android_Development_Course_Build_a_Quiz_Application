fun main() {
    var x = 5
    val y = 6
    val kali = x * y
    println(kali)
    val kurang = x - y
    println(kurang)
    val bagi = x / y
    println(bagi)
    val tambah = x + y
    println(tambah)
    val ngene = x % y
    println(ngene)
    x = 0
    println("1+3*4 = ${1 +3 * 4}")
    println("${x++}")
    println("${++x}")
    println("${x--}")
    println("${--x}")

    val brain_activate = false
    if (brain_activate == true){
        println("otak sudah teraktivasi dengan aman")
    }else{
        println("terindikasi menggunakan otak bajakan")
    }

    val isactive = false
    if (!isactive){
        println("online")
    }else{
        println("offline")
    }

    val HTTPstatus = 200
    if (!isactive && HTTPstatus == 200){
        println("requests accepted")
    }else if (HTTPstatus == 500){
        println("Server lelah kepanasan:(")
    }
    else{
        println("kouta habis")
    }


}