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

    var num1: Int = 2
    var num2: Int = 3

    var valorMaior: Int = if (num1 < num2) num2 else num1

    // Controle Range, representado entre Valor1..Valor2
    var valorComRange = if(num1 in num2..num2+10) "Num1 não é maior que Num2+10"  else "Não tem relação"

    var valorComWhen = when(num2){
        1 -> "O valor do num2 é 1"
        2, 3 -> "O valor do num2 esta entre 2 e 3"
        4, 7 -> "O valor do num2 esta entre 4 e 7"
        in 8..9 -> "O valor do num2 esta entre 8 e 9"
        else -> "Não é um digito"
    }

    println("Digite um número: ")
    while(num1 != 5){
        val line = readLine() ?: "0"
        num1 = line.toIntOrNull() ?: 0
        println("O valor que você digitou foi $num1")
    }

    // for (i in Valor1..Valor2) -- o i vai percorrer de forma crescente
    // for (i in Valor1 downTo Valor2) -- o i vai percorrer de forma decrescente
    // for (i in Valor1..Valor2 step ValorControle) -- o i vai percorrer de forma crescente porem incrementando +ValorControle
    // for (i in Valor1 downTo Valor2 step ValorControle) -- o i vai percorrer de forma decrescente porem incrementando +ValorControle
    // for((indice, objetoDoArray) in array.withIndex()){} -- Aqui estamos utilizando o destructuring no for

    println(listOf(
        countNumber(num1 ,num2),
        countNumber(),
        valorMaior,
        valorComRange,
        valorComWhen
    ))

}