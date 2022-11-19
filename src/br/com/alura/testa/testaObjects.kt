package br.com.alura.testa

import br.com.alura.modelo.Autenticavel
import br.com.alura.modelo.Cliente
import br.com.alura.modelo.Conta
import br.com.alura.modelo.ContaPoupanca

fun testaObjects() {
    val jose = object : Autenticavel {
        val nome = "José"
        val cpf = "111.111.111-11"
        val senha = 1234
        override fun autenticacao(senha: Int): Boolean = this.senha == senha
    }

    if (jose.autenticacao(1234)) println("Bem vindo! ${jose.nome}")

    val contaPoupanca = ContaPoupanca(Cliente("jose", "111.111.111-11", 1234), 1000)

    println("Total de contas criadas: ${Conta.total}")
}