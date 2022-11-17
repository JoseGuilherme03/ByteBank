package br.com.alura.modelo

class testaContaSalario {
    fun testaContaSalario() {
        val alex = ContaSalario(Cliente("Alex","111.111.111-11",4321), 2000)
        val fran = ContaCorrente(Cliente("Fran","111.111.111-11",1234), 3000)

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