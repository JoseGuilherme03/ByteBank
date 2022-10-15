fun main() {
    println("Bem vindo ao Bytebank")
    val contaAlex = Conta("Alex", 1000)
    contaAlex.depositar(1100.0)

    val contaFran = Conta("Fran", 2000)
    contaFran.depositar(100.0)


    println(contaAlex.titular)
    println(contaAlex.conta)
    println(contaAlex.saldo)
    println()
    println(contaFran.titular)
    println(contaFran.conta)
    println(contaFran.saldo)
    println()

    println("Depositando na conta do alex")
    contaAlex.depositar(50.0)
    println(contaAlex.saldo)

    println("Depositando na conta da fran")
    contaFran.depositar(100.0)
    println(contaFran.saldo)

    println("Fazendo saque na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("Fazendo saque na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("Fazendo transferência da conta do Alex para a da Fran")
    if (contaAlex.tranferi(100.0,contaFran)) {
        println("Valor transferido com sucesso")
        println("conta Fran = ${contaFran.saldo}")
        println("conta Alex = ${contaAlex.saldo}")
    } else {
        println("Valor da tranferência maior que o do saldo!!")
    }
}


class Conta(
    val titular: String, val conta: Int
) {
    var saldo = 0.0
        private set


    fun depositar(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (valor <= saldo) {
            this.saldo -= valor
        }
    }

    fun tranferi(valor: Double, destinatario: Conta): Boolean {
        if (saldo >= valor) {
            this.saldo -= valor
            destinatario.saldo += valor
            return true
        }
        return false
    }
}

fun testaLoop(titular: String, numeroConta: Int, saldo: Double) {
    for (i in 3 downTo 1) {
        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
    }

//    for (i in 1..5 step 2){
//        println("titular $titular")
//        println("número da conta $numeroConta")
//        println("saldo da conta $saldo")
//        println()
//    }
}


fun testaCondicao(saldo: Double) {
    if (saldo > 0.0) {
        println("Saldo é positivo!!")
    } else if (saldo == 0.0) {
        println("Saldo é neutro")
    } else {
        println("Saldo é negativo!!")
    }

//    when {
//        saldo > 0.0 -> {
//            println("Saldo é positivo!!")
//        }
//        saldo == 0.0 -> {
//            println("Saldo é neutro")
//        }
//        else -> {
//            println("Saldo é negativo!!")
//        }
//    }
}