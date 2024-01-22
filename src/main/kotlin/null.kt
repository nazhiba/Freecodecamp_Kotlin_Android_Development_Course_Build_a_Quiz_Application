fun main() {
    var text:String? = null
//    if (text != null){
//        println(text.length)
//    }else{
//        println("The variabel is null")
//    }

//    text = "Panjang teks"
    println(text?.length)

    val teks2 = text?: "nilai kosong"
    println(teks2)
}