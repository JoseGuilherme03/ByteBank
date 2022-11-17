package br.com.alura.modelo

class Auxiliar(nome: String, cpf: String, salario: Double ) : Funcionarios(nome,cpf,salario) {
    override val bonificacao: Double = salario + (salario * 0.5)
}