fun addGood(name: String, price: Int, count: Int){
    fun sum(): Int{
        return price*count
    }
    println("В корзину добавлен ${name} на сумму ${sum()}");
}

fun main(){
    addGood("товар",300,9)
}