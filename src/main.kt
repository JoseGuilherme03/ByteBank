fun main() {
    println("Bem vindo ao Bytebank")

    val alex = Funcionarios("Alex","111.111.111-11",1000.0)
    val fran = Gerente("Fran","222.222.222-22",2000.0, "1234")
    val gui = Diretor("Gui","333-333-333-33",4000.0, "4321",200.0)

    println("Nome: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salário: ${alex.salario}")
    println("Bonificação: ${alex.bonificacao}")
    println()

    if (fran.autenticacao("1234")){
        println("Autenticado com sucesso!!")
        println("Nome: ${fran.nome}")
        println("CPF: ${fran.cpf}")
        println("Salário: ${fran.salario}")
        println("Bonificação: ${fran.bonificacao}")
    } else{
        println("Senha incorreta!!")
    }

    println()
    println("Nome: ${gui.nome}")
    println("CPF: ${gui.cpf}")
    println("Salário: ${gui.salario}")
    println("Bonificação: ${gui.bonificacao}")
    println("PLR: ${gui.plr}")
}







