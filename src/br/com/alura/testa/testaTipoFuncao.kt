package br.com.alura.bytebank.br.com.alura.testa


fun testaFuncaoAnonima() {
    val calculaBonificacao = fun(salario: Double): Double {
        if (salario > 1000) {
            return salario + 100
        }
        return salario + 50
    }

    println(calculaBonificacao(1000.0))
}

fun testaFuncaoLambdaLabels() {
    val calcularBonificacao = lambda@{ salario: Double ->
        if (salario > 1000) {
            return@lambda salario + 100
        }
        return@lambda salario + 50
    }

    println(calcularBonificacao(1000.0))
}

fun testaMinhaFuncaoAnonima() {
    val minhaFuncaoAnonima = fun(a: Int, b:Int): Int {
        return a + b
    }
    println(minhaFuncaoAnonima(5, 5))
}

fun testeMinhaFuncaoLambda() {
    val minhaFuncaoLambda = { a: Int, b: Int ->
        a + b
    }
    println(minhaFuncaoLambda(3, 2))
}

fun testeMinhaFuncao() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5,5))
}

fun testeMinhaFuncaoClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasse(2, 2))
}

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int {
        return a + b
    }
}

fun soma(a: Int, b: Int): Int {
    return a + b
}