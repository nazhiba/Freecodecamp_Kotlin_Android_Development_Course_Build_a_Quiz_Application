fun main() {
    sum(1,2,3,4,5,6,7,8)
    sam(1,2,3,4,5,6,7,8)
}
fun sum(vararg number:Int):Int{
    var x = 0
    for (i in number){
        println(x)
        x+=i

    }
    return x


}


fun sam(vararg number: Int){
    number.forEach {  println(it)}
}