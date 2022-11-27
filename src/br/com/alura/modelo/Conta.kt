package br.com.alura.modelo

abstract class Conta(
    var titular: Cliente,
    val numero: Int
): Autenticavel {

    companion object {
        var total = 0
            private set
    }

    init {
        println("Criando conta...")
        Companion.total ++
    }

    var saldo = 0.0
        protected set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)
}