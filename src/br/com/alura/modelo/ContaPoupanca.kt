package br.com.alura.modelo

import br.com.alura.bytebank.br.com.alura.exceptions.FalhaNaAutenticacaoException
import br.com.alura.exceptions.SaldoInsuficienteException

class ContaPoupanca(titular: Cliente, numero: Int) : Conta(titular, numero), FazTransferencia {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    override fun autenticacao(senha: Int): Boolean {
        return titular.autenticacao(senha)
    }


    override fun transfere(valor: Double, destino: Conta,senha: Int){
        if (saldo < valor) {
            throw SaldoInsuficienteException(
                mensagem="Saldo é insuficiente. Saldo atual: $saldo. Valor a ser tranferido: $valor."
            )
        }

        if (!autenticacao(senha)) throw FalhaNaAutenticacaoException()

        saldo -= valor
        destino.deposita(valor)
    }

}