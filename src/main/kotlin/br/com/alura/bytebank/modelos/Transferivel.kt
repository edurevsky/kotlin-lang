package br.com.alura.bytebank.modelos

interface Transferivel {

    fun fazTransferencia(destino: Conta, valor: Double, senha: String)
}