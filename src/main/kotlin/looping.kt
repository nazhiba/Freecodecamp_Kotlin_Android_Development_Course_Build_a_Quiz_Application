fun main() {
    for (i in 1..10){
        println("i = $i")
    };

    for (i in 1 until 10){
        println("i = $i")
    };

    for (i in 1 downTo 10){
        println("i = $i")
    };
    for (i in 1 until 10 step 2){
        println(i)
    }
}