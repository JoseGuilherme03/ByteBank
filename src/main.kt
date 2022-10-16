fun main() {
    println("Bem vindo ao Bytebank")

    val alex = Funcionarios("Alex","111.111.111-11",1000.0)
    val fran = Gerente("Fran","222.222.222-22",2000.0, "1234")

    println("Nome: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salário: ${alex.salario}")
    println("Bonificação: ${alex.bonificacao()}")
    println()

    println("Nome: ${fran.nome}")
    println("CPF: ${fran.cpf}")
    println("Salário: ${fran.salario}")
    println("Bonificação: ${fran.bonificacao()}")

    if (fran.autenticacao("1234")){
        println("Autenticado com sucesso!!")
    } else{
        println("Senha incorreta!!")
    }

}







