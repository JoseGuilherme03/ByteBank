package br.com.alura.modelo

class SistemaInterno {
    fun entra(admin: Autenticavel, senha: Int){
        if (admin.autenticacao(senha)){
            println("Bem vindo ao ByteBank")
        }else{
            println("Senha Incorreta")
        }
    }
}