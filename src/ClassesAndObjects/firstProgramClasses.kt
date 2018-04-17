package ClassesAndObjects

class geladeira(val marca: String, val litros:Int)

data class televisao (val marca: String, val polegadas: Int) // Essa classe ja vem implementado get, set, toString, destructuring, equals, copy e etc

data class radio (val marca: String, val preco: Double, val desconto: Double){
  val precoComDesconto: Double get() = preco * (1 - desconto) // campo calculado
}

fun main(args: Array<String>) {

    val tv1 = televisao("Toshiba",32)
    val tv2 = tv1.copy(polegadas = 55)
    val radio = radio("Philco", 100.00, 0.10)

    // destructuring em data class

    val (marca, polegadas) = tv1

    println("$tv1  $tv2, destructuring $marca $polegadas")
    println(tv1.marca)
    println(radio.precoComDesconto)
}