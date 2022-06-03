package br.com.alura.bytebank.testes

import br.com.alura.bytebank.exceptions.SaldoInsuficienteException
import br.com.alura.bytebank.modelos.Cliente
import br.com.alura.bytebank.modelos.ContaCorrente

fun testaSaldoInsuficiente() {
    val conta1 = ContaCorrente(
        titular = Cliente(
            nome = "Fulano",
            cpf = "123",
            senha = "123"
        ),
        numero = 42
    )
    val conta2 = ContaCorrente(
        titular = Cliente(
            nome = "Ciclano",
            cpf = "123",
            senha = "123"
        ),
        numero = 43
    )

    conta1.fazDeposito(10.0)
    conta2.fazDeposito(20.0)

    conta2.fazTransferencia(valor = 20.0, destino = conta1, senha = "123")

    try {
        conta1.fazTransferencia(valor = 40.0, destino = conta2, senha = "123")
    }
    catch (e: SaldoInsuficienteException) {
        println("conta1 com Saldo insuficiente")
        e.printStackTrace()
    }
}