package br.com.alura.modelo

abstract class Funcionarios(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    abstract val bonificacao: Double
}