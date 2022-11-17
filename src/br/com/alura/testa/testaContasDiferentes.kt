import br.com.alura.modelo.ContaCorrente
import br.com.alura.modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente("Alex", 1000)
    val contaPoupanca = ContaPoupanca("Fran", 2000)

    contaPoupanca.deposita(1000.0)
    contaCorrente.deposita(1000.0)
    println("Saldo após o depósito:")
    println("br.com.alura.modelo.Conta Poupança: ${contaPoupanca.saldo}")
    println("br.com.alura.modelo.Conta Corrente: ${contaCorrente.saldo}")

    println()
    contaPoupanca.saca(100.0)
    contaCorrente.saca(100.0)
    println("Saldo após o saque:")
    println("br.com.alura.modelo.Conta Poupança: ${contaPoupanca.saldo}")
    println("br.com.alura.modelo.Conta Corrente: ${contaCorrente.saldo}")

    println()
    contaCorrente.transfere(100.0, contaPoupanca)
    println("Saldo corrente após tranferir para poupança: ${contaCorrente.saldo}")
    println("Saldo poupança após a tranferência: ${contaPoupanca.saldo}")

    println()
    contaPoupanca.transfere(100.0, contaCorrente)
    println("Saldo poupança após tranferir para corrente: ${contaPoupanca.saldo}")
    println("Saldo corrente após a tranferência: ${contaCorrente.saldo}")
}