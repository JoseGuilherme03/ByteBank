abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) :Funcionarios(nome,cpf,salario){

    fun autenticacao(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }
}