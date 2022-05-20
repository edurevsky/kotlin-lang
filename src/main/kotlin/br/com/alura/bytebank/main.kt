package br.com.alura.bytebank

import br.com.alura.bytebank.testes.testaAutenticacao
import br.com.alura.bytebank.testes.testaContas
import br.com.alura.bytebank.testes.testaContasDiferentes
import br.com.alura.bytebank.testes.testaFuncionarios

fun main() {
    println("Bem vindo ao Bytebank!")

    testaContas()
    testaFuncionarios()
    testaContasDiferentes()
    testaAutenticacao()
}