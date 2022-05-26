package br.com.alura.bytebank.testes

import br.com.alura.bytebank.modelos.Endereco

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