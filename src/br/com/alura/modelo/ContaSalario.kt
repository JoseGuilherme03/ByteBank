package br.com.alura.modelo

class ContaSalario(titular:Cliente, numero:Int): Conta(titular,numero) {
    override fun saca(valor: Double) {
            if (this.saldo >= valor) {
                this.saldo -= valor
            }
        }
}