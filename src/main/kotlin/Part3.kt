fun main() {
    val ongko = listOf("one", "two","three")
    println(ongko.associateWith { it.length })
    println(ongko.associateBy { it.first().uppercase() })
    println(ongko.associateBy(keySelector = {it.first().uppercase()}, valueTransform = {it.length}))

//    flatten
    val numberset = listOf(setOf(1,2,3), setOf(4,5,6), setOf(7,8,9))
    println(numberset[2])
    for (number in numberset){
        for (x in number){
            println(x)
        }
        println("\n")
    }

    val numberflatten = numberset.flatten()
    println(numberflatten[8])
    for (number in numberflatten){
        println(number)
    }
}
