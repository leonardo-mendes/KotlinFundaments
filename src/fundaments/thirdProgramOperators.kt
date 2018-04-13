package fundaments

data class Carro (val marca: String, val modelo: String)

// Função como ja vimos no arquivo secondProgramFunctions
fun obterResult(param: Int)  = if(param < 5) "Menor" else "Maior"

fun main(args: Array<String>) {

    // Abaixo vamos utilizar o operador destructuring para retirar variaveis de um objeto ou de um array
    val (marca , modelo) =  Carro("Ford", "Fiesta")
    println("Carro na marca $marca e modelo $modelo")

    val (mulher, _ , marido) = listOf("Bela", "Antonio", "José")
    println("Marido é $marido e Mulher é $mulher")

    // Operadores Lógicos é muito util para gente preencher uma variavel com a resolução de duas funções.
    val exec1: Boolean = true
    val exec2: Boolean = true

    val result1 = exec1 || exec2
    val result2 = exec1 && exec2
    val result3 = exec1 xor exec2
    // !is é a negação -- o conceito instead of foi substituido por as um cast que seria (objeto as Classe) e ainda podemos usar optional as? se não conseguir retorna null
    var checkResult1 = result1 is Boolean

    println(listOf(result1, result2, result3, obterResult(6), checkResult1 ))

}