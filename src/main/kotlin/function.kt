fun main() {
    nadzib("nadzib", 19)
    val punyakoneksi = true
    if (punyakoneksi) online(200) else offline(404)
}

fun nadzib(nama:String, age:Int){
    println("Hello, $nama, umur $age")

}

fun online(HTTP:Int){
    println("Terhubung dengan aman sentosa\n requests $HTTP")
}

fun offline(HTTP:Int){
    println("Beli kouta dulu $HTTP")
}