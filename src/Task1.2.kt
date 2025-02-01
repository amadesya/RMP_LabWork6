import kotlin.math.*

fun nthTermGeometricProgression(n: Int,a1: Int = 1, ratio: Int = 2) {
    println("Значение ${n}-ого геометрической прогрессии: ${a1 * ratio.toDouble().pow(n - 1).toInt()}")
}

fun main() {
    nthTermGeometricProgression(5)
    nthTermGeometricProgression(7,2,4)
}
