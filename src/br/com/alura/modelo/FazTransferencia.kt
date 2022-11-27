package br.com.alura.modelo

interface FazTransferencia {
    fun transfere(valor: Double, destino: Conta, senha:Int)
}