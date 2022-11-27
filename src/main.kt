package br.com.alura.bytebank

import br.com.alura.modelo.Endereco

fun main() {
    println("início main")
    val entrada = "1.0"

    val valor: Double? = try {
        entrada.toDouble()
    } catch (e:NumberFormatException) {
       println("Problema na Conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa:Double? = if (valor != null) valor + 0.1 else null

    println(
        if (valorComTaxa != null) "Valor recebido: $valorComTaxa" else "valor inválido"
    )

    funcao1()
    println("fim main")
}

fun funcao1(){
    println("início funcao1")
    try {
        funcao2()
    } catch (e:ClassCastException) {
        println("ClassCastException foi pegada")
        println(e.printStackTrace())
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5){
        println(i)
//        val endereco = Any()
//        endereco as Endereco
    }
    println("fim funcao2")
}















