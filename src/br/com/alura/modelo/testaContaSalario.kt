package br.com.alura.modelo

class testaContaSalario {
    fun testaContaSalario() {
        val alex = ContaSalario("Alex", 2000)
        val fran = ContaCorrente("Fran", 3000)

        fran.deposita(1000.0)

        if (fran.transfere(1000.0, alex)) {
            println("Tranferência concluida")
        } else {
            println("Sem saldo disponivel!!")
        }

        println("Saldo Alex: ${alex.saldo}")
        println("Saldo Fran: ${fran.saldo}")
    }
}