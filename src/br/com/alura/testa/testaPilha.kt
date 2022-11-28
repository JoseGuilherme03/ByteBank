package br.com.alura.bytebank.br.com.alura.testa

import br.com.alura.exceptions.SaldoInsuficienteException

fun funcao1(){
    println("início funcao1")
    try {
        funcao2()
    } catch (e: SaldoInsuficienteException) {
        println("SaldoInsuficienteException foi pegada")
        e.printStackTrace()
    }
    println("fim funcao1")
}


fun funcao2() {
    println("início funcao2")
    for (i in 1..5){
        println(i)
        throw SaldoInsuficienteException()
    }
    println("fim funcao2")
}