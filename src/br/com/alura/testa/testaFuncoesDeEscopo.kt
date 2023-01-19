package br.com.alura.bytebank.br.com.alura.testa

import br.com.alura.modelo.Endereco

fun testaFuncoesDeEscopo() {
//    val endereco = Endereco(cidade = "Barra Velha", bairro = "Centro")
//    val enderecoEmMaiusculo = "${endereco.cidade}, ${endereco.bairro}".toUpperCase()
//    println(enderecoEmMaiusculo)

    Endereco(cidade = "Barra Velha", bairro = "Centro").run {
        "$cidade, $bairro".toUpperCase().let {
            println(it)
        }
    }
}