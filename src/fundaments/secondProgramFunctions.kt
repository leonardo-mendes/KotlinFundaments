package fundaments

// Paramêtros com valores default
fun countNumber(a: Int = 1, b: Int = 1): Int {
    return a + b
}

fun main(args: Array<String>) {

    // Todas as declarações abaixos estão corretas para declarar função.
    // fun nomeFuncao(param: Tipo) TipoRetorno {}
    // fun nomeFuncao() TipoRetorno {}
    // fun nomeFuncao(param: Tipo) {}
    // fun nomeFuncao() {}

    println(listOf(countNumber(1 ,3), countNumber()))

}