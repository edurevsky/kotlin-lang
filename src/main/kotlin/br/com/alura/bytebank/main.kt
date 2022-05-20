package br.com.alura.bytebank

import br.com.alura.bytebank.modelos.Conta
import br.com.alura.bytebank.testes.*

fun main() {
    println("Bem vindo ao Bytebank!")

    testaContas()
    testaFuncionarios()
    testaContasDiferentes()
    testeContasTransferiveis()
    testaAutenticacao()

    println("Total de contas: ${Conta.totalContas}")
}