fun circleArea(radius: Int){
    return println("Площадь круга с радиусом ${radius} = ${String.format(String.format("%.2f", Math.PI * radius))}")
}

fun circleArea(a: Int, b: Int){
    return println("Площадь эллипса с малой полуосью ${a} и большой полуосью ${b} равно ${String.format("%.2f",(Math.PI * a * b))}")
}

fun main(){
    circleArea(4)
    circleArea(5,6)
}