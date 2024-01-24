fun main() {
    val maks = maksimal(arrayOf(1,2,3,4,5,6,7))
    val min = minimal(arrayOf(1,2,3,4,5,6,7))
    val minmax = minmax(arrayOf(1,2,3,4,5,6,7), true)
    val minmin = minmax(arrayOf(1,2,3,4,5,6,7), false)

    println("Maksimal adalah = $maks")
    println("Minimal adalah = $min")

    println("Minmax function  = $minmax")
    println("Minmax function  = $minmin")
}

fun maksimal(numbers:Array<Int>):Int{
    var maks = numbers[0]
    for (nomor in numbers){
        if (nomor > maks){
            maks = nomor
        }
    }
    return  maks

}

fun minimal(numbers:Array<Int>):Int{
    var min = numbers[0]
    for (nomor in numbers){
        if (nomor < min){
            min = nomor
        }
    }
    return  min

}

fun minmax(x:Array<Int>, y:Boolean):Int{
    var max = x[0]
    var min = max

    if (y){
        for (i in x){
            if (i > max) {
                max = i
            }
        }
        return max
    }else{
        for (i in x){
            if (i < min){
                min = i
            }
        }

        return min
    }

}
