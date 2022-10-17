class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionarios){
        total += funcionario.bonificacao
    }
}