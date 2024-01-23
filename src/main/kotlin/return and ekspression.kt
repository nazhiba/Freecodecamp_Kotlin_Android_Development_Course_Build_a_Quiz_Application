fun main() {
    val x = daribesarkekecil(19,20)
    println(x)

    val y = new_daribesarkekecil(19,20)
    println(y)

    val z = fan(19,20)
    println(z)
}

fun daribesarkekecil(x:Int, y:Int):Int{
    val max = if (y>x) y else x
    return max
}

//cara lain
fun new_daribesarkekecil(x:Int, y: Int):Int{
    if (y > x){
        return y
    } else {
        return x
    }
}

//just one line
fun fan(x:Int, y: Int) = if (y>x) y else x