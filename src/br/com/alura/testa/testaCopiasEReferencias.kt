import br.com.alura.modelo.Cliente
import br.com.alura.modelo.ContaCorrente
import br.com.alura.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = ContaCorrente(Cliente("João","111.111.111-11",1234), 1002)
    contaJoao.titular.nome = "João"
    var contaMaria = ContaPoupanca(Cliente("Maria","111.111.111-11",4321), 1003)
    contaMaria.titular.nome = "Maria"
    contaJoao.titular.nome = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

}