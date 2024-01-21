fun main() {
    val alaram = 7
    val text = when{
        alaram <= 10 -> "masih pagi"
        alaram >= 10 -> "Menjelang siang"
        alaram >= 12 -> "Siang"
        alaram >= 15 -> "Sore"
        else -> "Waktumu pirang jam?"
    }

    println(text)
}