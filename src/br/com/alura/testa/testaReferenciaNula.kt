package br.com.alura.bytebank.br.com.alura.testa

import br.com.alura.modelo.Endereco

fun testaReferenciaNula() {
    val enderecoNulo: Endereco? = Endereco(logradouro = "Rua Vergueiro", complemento = "prédio")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println(tamanhoComplemento)

    }

    teste("")
    teste(1)
}


fun teste(valor: Any) {
    val numero: Int? = valor as? Int
    println(numero)
}