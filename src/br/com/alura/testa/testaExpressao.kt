package br.com.alura.bytebank.br.com.alura.testa

fun testaExpressao() {
    val entrada = "1.0"

    val valor: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na Conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valor != null) valor + 0.1 else null

    println(
        if (valorComTaxa != null) "Valor recebido: $valorComTaxa" else "valor inválido"
    )
}