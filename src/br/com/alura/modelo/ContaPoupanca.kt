package br.com.alura.modelo

class ContaPoupanca(titular: String, numero: Int) : Conta(titular, numero), FazTransferencia {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
    override fun transfere(valor: Double, destino: Conta) : Boolean{
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}