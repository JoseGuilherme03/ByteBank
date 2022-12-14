import br.com.alura.bytebank.br.com.alura.exceptions.FalhaNaAutenticacaoException
import br.com.alura.exceptions.SaldoInsuficienteException
import br.com.alura.modelo.Cliente
import br.com.alura.modelo.ContaCorrente
import br.com.alura.modelo.ContaPoupanca

fun testaComportamentosConta() {
    val clienteAlex = Cliente("Alex","111.111.111-11",12)
    val contaAlex = ContaCorrente(clienteAlex, numero = 1000)
    contaAlex.deposita(200.0)

    val contaFran = ContaPoupanca(numero = 1001, titular=Cliente("Fran","111.111.111-11",123))
    contaFran.deposita(300.0)

    println(contaFran.titular.nome)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular.nome)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Alex")

    try {
        contaFran.transfere(destino = contaAlex, valor = 250.0, senha = 123)
        println("Transferência sucedida")
    } catch (e:SaldoInsuficienteException) {
        println("Falha na transferência")
        e.printStackTrace()
    } catch (e:FalhaNaAutenticacaoException) {
        println("Falha na Autenticação")
        e.printStackTrace()
    } catch (e:Exception) {
        println("Erro Desconhecido")
        e.printStackTrace()
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}