package br.com.alura.bytebank.modelos

import br.com.alura.bytebank.exceptions.SaldoInsuficienteException

abstract class ContaTransferivel(
    titular: Cliente,
    numero: Int
) : Conta(titular, numero), Transferivel {

    override fun fazTransferencia(destino: Conta, valor: Double) {
        if (saldo < valor) {
            throw SaldoInsuficienteException()
        }
        this.saldo -= valor
        destino.fazDeposito(valor)
        println("Transferência de $valor (${titular.nome} -> ${destino.titular.nome})")
    }
}