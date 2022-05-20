package br.com.alura.bytebank.testes

import br.com.alura.bytebank.modelos.Cliente
import br.com.alura.bytebank.modelos.ContaCorrente
import br.com.alura.bytebank.modelos.ContaPoupanca
import br.com.alura.bytebank.modelos.ContaSalario

fun testeContasTransferiveis() {

    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "João",
            cpf = "",
            senha = "senha"
        ),
        numero = 8217
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(
            nome = "Mari",
            cpf = "",
            senha = "senha"
        ),
        numero = 4242
    )

    val contaSalario = ContaSalario(
        titular = Cliente(
            nome = "Mário",
            cpf = "",
            senha = "senha"
        ),
        numero = 1281
    )

    contaCorrente.fazDeposito(1000.0)
    contaPoupanca.fazDeposito(1000.0)
    contaSalario.fazDeposito(1000.0)

    contaCorrente.fazTransferencia(contaPoupanca, 1.0)
    contaPoupanca.fazTransferencia(contaCorrente, 1.0)

    contaCorrente.fazTransferencia(contaSalario, 1.0)
    contaPoupanca.fazTransferencia(contaSalario, 1.0)

    // contaSalario.fazTransferencia()
}