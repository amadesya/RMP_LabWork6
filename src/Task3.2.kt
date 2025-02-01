fun series(vararg numbers: Int){
    val result = numbers.max() - numbers.min()
    println("${result}")
}

fun main() {
    series(3,4,5,6,7,8,9,0,63,5)
}