package br.com.alura.modelo

class Cliente (var nome:String, val cpf:String, val senha: Int, var endereco: Endereco = Endereco()): Autenticavel {
    override fun autenticacao(senha: Int): Boolean {
        if (this.senha == senha){
            return true
        }
        return false
    }
}