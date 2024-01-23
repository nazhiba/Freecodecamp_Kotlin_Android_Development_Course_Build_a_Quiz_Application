fun main() {
    sendmessage("nadzib",message = "hello world")
}

fun sendmessage(nama:String = "anonim",message:String = ppp()){
    println("$nama : $message")
}

fun ppp() = "some text!"