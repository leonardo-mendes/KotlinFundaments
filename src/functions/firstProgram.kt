package functions

import java.util.*

fun relacaoTrabalho(funcionario: String = "Juca", chefe: String = "Tião") =
    "O chefe é o $chefe e seu funcionário o $funcionario"

data class Horario(val hora: Int, val minuto: Int, val segundo: Int)

// Função para praticar o destructuring
fun agora(): Horario {
    val agora = Calendar.getInstance()
    // O with serve para facilitar a gente a utilizar o get sem precisar declarar agora.get(Calendar.HOUR)
    with(agora) {
        return Horario(get(Calendar.HOUR), get(Calendar.MINUTE), get(Calendar.SECOND))
    }
}

// Função de lista genérica que pode ter um retorno null ou seja podemos usar todas as listas aqui
fun <E> List<E>.secondOrNull(): E? = if (this.size >= 2) get(1) else null

// O vararg nos fala que podemos passar varios parametros sem declara-los separadamente na construção da função
fun ordenar(vararg numeros: Int): IntArray = numeros.sortedArray()

fun main(args: Array<String>) {
    println(relacaoTrabalho("Joao", "Pedro"))
    println(relacaoTrabalho(chefe = "Leonardo", funcionario = "Batista")) // Os parametros podem ser nomeados
    println(relacaoTrabalho()) // Os parametros podem ser default

    // Função tem um retorno multiplo então conseguimos usar destructuring para guardar o valor nos 3 valores.
    val (a, b, c) = agora()
    println("$a $b $c")

    for (n in ordenar(1, 4, 3, 2, 345, 100))
        print("$n ")

    // Lembrando que parametros são "imutaveis" eles não pode ser reatribuidos.
}