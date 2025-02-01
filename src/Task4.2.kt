import kotlin.math.*

fun countResult(s: Int, r: Int, n: Int, op: (Int, Int, Int) -> Int) {
    println("${op(s, r, n)}")
}

fun simpleInterest(s: Int, r: Int, n: Int): Int {
    return ((s * r * n)/100)
}

fun compoundInterest(s: Int, r: Int, n: Int): Int {
    return (s * (1 + r.toDouble() / 100).pow(n)).toInt()
}

fun main() {
    countResult(1000, 10, 9, ::simpleInterest)
    countResult(1000, 10, 9, ::compoundInterest)
}
