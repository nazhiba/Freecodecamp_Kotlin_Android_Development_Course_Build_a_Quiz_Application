fun main() {
    var x = 1
    val y = 20
    var z = 0
    while (x <= y){
        x++
        if (!isevenumber(x)){
            continue
        }
        z++
        println(x)
    }
    println("total number of even number found = $z")

}

fun isevenumber(x:Int):Boolean{
    if ((x % 2) == 0){
        return true
    }else{
        return false
    }
}
