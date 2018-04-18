package Lambdas

fun main(args: Array<String>) {

    fun calcular(a: Int, b: Int, operacao: (Int, Int) -> Int): Int =
        operacao(a, b) // Metodo com metodo como parametro, utilizando lambda

    val soma = { x: Int, y: Int -> x + y } // lambda simples

    println(
        listOf(
            soma(2, 3),
            calcular(3, 3, soma)
        )
    )
}