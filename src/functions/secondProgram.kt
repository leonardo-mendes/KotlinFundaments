package functions

class Produto (val nome: String, val preco: Double)

// Estamos declarando uma nova função para a classe sem ser dentro dela
infix fun Produto.maisCaroQue(produto: Produto): Boolean = this.preco > produto.preco

fun somar(a: Int, b: Int): Int = a+b

// Aqui estamos chamando uma função como parametro. devemos somente passar seus parametros e seu retorno com lambda
fun calc (a: Int, b: Int, funcao:(Int, Int)-> Int)= funcao(a,b)

// Funções inline podemos executar funções genericas
inline fun <T> executarFuncaoLog(nomeFuncao: String, funcao: () -> T): T {
    println("Inicio de execução do metodo $nomeFuncao")
    try {
        return funcao()
    } finally {
        println("Fim de execução do metodo $nomeFuncao")
    }
}

fun main(args: Array<String>) {

    val p1 = Produto("produto1", 2.2)
    val p2 = Produto("produto2", 2.5)
    println(p1 maisCaroQue p2) // o infix faz com que podemos acessar a função dessa maneira.

    // Função dentro de função
    println(calc(1, 2, ::somar))

    // A função inline dev funcionar dessa maneira, se reparamos na delcaração do metodo não temos parametros porem a função podemos utilizar
    val resultado = executarFuncaoLog("soma"){
        somar(4, 5)
    }

}