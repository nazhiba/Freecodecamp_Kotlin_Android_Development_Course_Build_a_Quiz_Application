fun main() {
    var number = 10
    do {
        println(number)
    }while (number < 10)

    while (number < 10) {
        number++
        if (number == 7){
            continue
        }
        println(number)

    }

    var x = 0
    while (x<10){
        x++
        if (x == 2){
            continue
        }
        println(x)

    }

    var n = 0
    samba@ while (n<5){
        n++
        println(n)
        var i = 0
        while (i < 5){
            if (i == 0) break@samba
            i++
            println("===$i")
        }
    }//output = 1
}