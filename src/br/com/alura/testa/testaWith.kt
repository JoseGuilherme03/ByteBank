package br.com.alura.bytebank.br.com.alura.testa

import br.com.alura.modelo.Endereco

fun testaWith() {
    val enderecoCompleto = with(Endereco()) {
        logradouro = "Avenida Parana"
        cidade = "Barra Velha"
        bairro = "Centro"
        numero = 345
        completo()
    }.let(::println)
}