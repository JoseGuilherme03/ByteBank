package br.com.alura.bytebank.br.com.alura.testa

fun testaHOF() {

//    somaReceiver(2,2) {
//        println(this)
//    }
//
//    soma(2, 2, resultado = {
//        println(it)
//    })
//
//    soma(4, 4, resultado = (::println))


    soma(2,2) {
        println(it)
    }
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("Antes do Resultado")
    resultado(a + b)
    println("Depois do Resultado")
}

fun somaReceiver(a: Int, b:Int, resultado: Int.() -> Unit) {
    println("Antes do resultado")
    val total = a+b
    total.resultado()
    println("Depois do resultado")
}