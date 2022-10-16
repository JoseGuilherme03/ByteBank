class Gerente(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val senha: String
){
    fun bonificacao(): Double {
        return salario * 0.20
    }

    fun autenticacao(senha: String): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}