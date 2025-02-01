fun module(n:Int):Int = if (n<0) -n else n

fun main(){
    println(module(-9))
    println(module(9))
    println(module(-199))
}