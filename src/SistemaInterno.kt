class SistemaInterno {
    fun entra(admin: FuncionarioAdmin,senha: Int){
        if (admin.autenticacao(senha)){
            println("Bem vindo ao ByteBank")
        }else{
            println("Senha Incorreta")
        }
    }
}