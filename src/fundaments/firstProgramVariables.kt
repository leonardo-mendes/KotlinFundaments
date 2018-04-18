package fundaments

fun main(args: Array<String>) {

    var numero1: Int
    numero1 = 10
    var numero2 = 2 // tipo inferido

    //var numero3 : Int
    var numero4 = 5

    // numero3 = 5.5
    // print("Números somados: "+ (numero3+numero4)) // devido a ser fortemente tipada não funcionária a soma de um Int com Double

    val numero6 = 99 // valor constante
    val numero7 = 99 // valor constante

    var pi: Double = (numero6 * numero7 * Math.PI) // Conseguimos usar Java sem qualquer configuração

    val aprovados = listOf("Joao", "Leo") // criando r
    val bomHumor: Boolean = false // tipo Boolean

    var a: Int? = null // Safe Call Operator, isso faz ele ser uma variavel com o valor Nulo (Variavel Opcional)
    val obrigatorio: Int = a
            ?: 4  // Elvis Operator ?: faz com que quando a variavel vai receber um valor ele garante que se for nulo sempre vai ter um padrão

    println(
        listOf(
            numero1,
            numero2,
            numero4,
            numero6,
            numero7,
            pi,
            "Aluno ${aprovados[0]}",
            numero1 is Int,
            numero1.dec(), // Sempre lembrar que tudo em Kotlin é objeto
            "leonardo".first().toUpperCase(),
            "Hoje estou ${if (bomHumor) "feliz" else "infeliz"}.", // Quando trabalhamos com uma variavel simples somente o $ atende, quando tem uma expressão devemos usar ${}
            a?.dec(), // não lança exceção de NullPointer
            obrigatorio
        )
    )

}