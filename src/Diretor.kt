class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String,
    val plr: Double
):  Funcionarios(nome, cpf, salario){

    override val bonificacao: Double
        get() {
            return  salario + plr +(salario * 0.40)
        }

    fun autenticacao(senha: String): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}