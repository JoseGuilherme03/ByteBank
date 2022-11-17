import br.com.alura.modelo.Analista
import br.com.alura.modelo.CalculadoraBonificacao
import br.com.alura.modelo.Diretor
import br.com.alura.modelo.Gerente

fun testaFuncionarios() {
    val alex = Analista("Alex", "111.111.111-11", 1000.0)
    val fran = Gerente("Fran", "222.222.222-22", 2000.0, 1234)
    val gui = Diretor("Gui", "333-333-333-33", 4000.0, 4321, 200.0)
    val maria = Analista("Maria", "444-444-444-44", 3000.0)

    println("Nome: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salário: ${alex.salario}")
    println("Bonificação: ${alex.bonificacao}")
    println()

    if (fran.autenticacao(1234)) {
        println("Autenticado com sucesso!!")
        println("Nome: ${fran.nome}")
        println("CPF: ${fran.cpf}")
        println("Salário: ${fran.salario}")
        println("Bonificação: ${fran.bonificacao}")
    } else {
        println("Senha incorreta!!")
    }

    println()
    println("Nome: ${gui.nome}")
    println("CPF: ${gui.cpf}")
    println("Salário: ${gui.salario}")
    println("Bonificação: ${gui.bonificacao}")
    println("PLR: ${gui.plr}")

    println()
    println("Nome: ${maria.nome}")
    println("CPF: ${maria.cpf}")
    println("Salário: ${maria.salario}")
    println("Bonificação: ${maria.bonificacao}")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println()
    println("Total de bonificação: ${calculadora.total}")
}