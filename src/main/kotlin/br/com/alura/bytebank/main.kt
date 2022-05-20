package br.com.alura.bytebank

import br.com.alura.bytebank.modelos.Conta
import br.com.alura.bytebank.modelos.Endereco
import br.com.alura.bytebank.testes.*

fun main() {
    println("Bem vindo ao Bytebank!")

//    testaContas()
//    testaFuncionarios()
//    testaContasDiferentes()
//    testeContasTransferiveis()
//    testaAutenticacao()

    testaEnderecos()

    // println("Total de contas: ${Conta.totalContas}")
}

fun testaEnderecos() {
    val endereco1 = Endereco(
        cep = "00000-000",
        logradouro = "Rua Vergueiro"
    )

    val endereco2 = Endereco(
        cep = "00000-000",
        logradouro = "Vila Mariana"
    )

    println(endereco1 == endereco2)
}