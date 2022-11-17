package br.com.alura.modelo

class ContaCorrente(titular: Cliente, numero: Int) : Conta(titular, numero), FazTransferencia {
    override fun saca(valor: Double){
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
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