package ClassesAndObjects

class Data(var dia: Int, var mes: Int, var ano:Int){

    fun formatar() = "$dia/$mes/$ano"

}

fun main(args: Array<String>) {
    var nascimento = Data(01,02,1992)
    println(nascimento.formatar())
}