import br.com.alura.modelo.Cliente
import br.com.alura.modelo.ContaCorrente
import br.com.alura.modelo.ContaPoupanca
import br.com.alura.modelo.Endereco

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        Cliente(
            "Alex",
            "111.111.111-11",
            1234,
            Endereco("Rua Prefeito Miguel Tito Rosa", bairro = "Morro Grande")
        ),
        1000
    )
    val contaPoupanca = ContaPoupanca(Cliente("Alex","111.111.111-11",1234), 2000)

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
    contaCorrente.transfere(100.0, contaPoupanca, 123)
    println("Saldo corrente após tranferir para poupança: ${contaCorrente.saldo}")
    println("Saldo poupança após a tranferência: ${contaPoupanca.saldo}")

    println()
    contaPoupanca.transfere(100.0, contaCorrente, 123)
    println("Saldo poupança após tranferir para corrente: ${contaPoupanca.saldo}")
    println("Saldo corrente após a tranferência: ${contaCorrente.saldo}")

    println()
    println("Bairro do Alex: ${contaCorrente.titular.endereco.bairro}")
    println("Rua do Alex: ${contaCorrente.titular.endereco.logradouro}")
}