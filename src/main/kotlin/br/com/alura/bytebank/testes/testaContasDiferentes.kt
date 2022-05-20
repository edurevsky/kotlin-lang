package br.com.alura.bytebank.testes

import br.com.alura.bytebank.modelos.Cliente
import br.com.alura.bytebank.modelos.ContaCorrente
import br.com.alura.bytebank.modelos.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Alex",
            cpf = "",
            senha = "senha"
        ),
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente("Fran", "", "senha"),
        numero = 1001
    )

    contaCorrente.fazDeposito(1000.0)
    contaPoupanca.fazDeposito(1000.0)

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.fazSaque(100.0)
    contaPoupanca.fazSaque(100.0)

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.fazTransferencia(contaPoupanca, 100.0)

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupança: ${contaPoupanca.saldo}")

    contaPoupanca.fazTransferencia(contaCorrente, 100.0)

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupança: ${contaPoupanca.saldo}")
}