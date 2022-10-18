class Gerente(
    nome: String, cpf: String, salario: Double, val senha: String
):  Funcionarios(nome, cpf, salario){

    override val bonificacao: Double get() =  salario + (salario * 0.30)

    fun autenticacao(senha: String): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}