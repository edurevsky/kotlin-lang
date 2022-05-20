package br.com.alura.bytebank.testes

import br.com.alura.bytebank.modelos.Analista
import br.com.alura.bytebank.modelos.CalculadoraDeBonificacao
import br.com.alura.bytebank.modelos.Diretor
import br.com.alura.bytebank.modelos.Gerente

fun testaFuncionarios() {
    val fulano = Analista("Fulano", "012.345.678-90", 3000.0)

    println("Nome: ${fulano.nome}")
    println("CPF: ${fulano.cpf}")
    println("Salário: ${fulano.salario}")
    println("Bonificação fulano: ${fulano.bonificacao}")
    val ciclano = Gerente(
        nome = "Ciclano",
        cpf = "012.345.678-90",
        salario = 4500.0,
        senha = "coxinha123"
    )
    println("Bonificação ciclano: ${ciclano.bonificacao}")

    if (ciclano.autentica("coxinha123")) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }

    val beltrano = Diretor(
        nome = "Beltrano",
        cpf = "012.345.678-90",
        salario = 6000.0,
        senha = "umasenha",
        plr = 200.0
    )
    println("Bonificação beltrano: ${beltrano.bonificacao}")

    val analista = Analista(
        nome = "modelos.Analista",
        cpf = "012.345.678-90",
        salario = 4000.0
    )

    val calculadora = CalculadoraDeBonificacao()
    calculadora.registraFuncionario(fulano)
    calculadora.registraFuncionario(ciclano)
    calculadora.registraFuncionario(beltrano)
    calculadora.registraFuncionario(analista)

    println("Total de bonificação: ${calculadora.total}")
}