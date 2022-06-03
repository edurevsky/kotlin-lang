package br.com.alura.bytebank.modelos

import br.com.alura.bytebank.exceptions.FalhaAutenticacaoException
import br.com.alura.bytebank.exceptions.SaldoInsuficienteException

abstract class ContaTransferivel(
    titular: Cliente,
    numero: Int
) : Conta(titular, numero), Transferivel {

    override fun fazTransferencia(destino: Conta, valor: Double, senha: String) {
        if (saldo < valor) {
            throw SaldoInsuficienteException("O valor $valor a ser transferido é maior que o saldo $saldo")
        }
        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }
        this.saldo -= valor
        destino.fazDeposito(valor)
        println("Transferência de $valor (${titular.nome} -> ${destino.titular.nome})")
    }
}