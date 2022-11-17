package br.com.alura.modelo

class Gerente(
    nome: String, cpf: String, salario: Double, senha: Int
):  FuncionarioAdmin(nome, cpf, salario,senha){

    override val bonificacao: Double get() =  salario + (salario * 0.30)
}