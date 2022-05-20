package br.com.alura.bytebank.testes

import br.com.alura.bytebank.modelos.Cliente
import br.com.alura.bytebank.modelos.ContaCorrente
import br.com.alura.bytebank.modelos.Endereco

fun testaContas() {
    val alex = Cliente(
        nome = "Alex",
        cpf = "",
        senha = "senha"
    )
    val contaAlex = ContaCorrente(alex, 1001)
    contaAlex.fazDeposito(42.0)
    contaAlex.fazDeposito(-1000.0)

    val fran = Cliente(
        nome = "Fran",
        cpf = "",
        senha = "senha",
        endereco = Endereco(
            logradouro = "Rua Vergueiro",
            numero = 42
        )
    )
    val contaFran = ContaCorrente(numero = 1002, titular = fran)
    contaFran.fazDeposito(300.0)

    contaAlex.mostrarDados()
    contaFran.mostrarDados()

    contaAlex.fazDeposito(90.0)
    println("Novo saldo de Alex: ${contaAlex.saldo}")

    contaFran.fazDeposito(10.0)
    println("Novo saldo de Fran: ${contaFran.saldo}")

    contaAlex.fazSaque(40.0)
    println("Novo saldo de Alex: ${contaAlex.saldo}")

    contaFran.fazSaque(250.0)
    println("Novo saldo de Fran: ${contaFran.saldo}")

    contaAlex.fazSaque(500.0)
    println("Saldo Alex: ${contaAlex.saldo}")

    contaFran.fazSaque(61.0)
    println("Saldo Fran: ${contaFran.saldo}")

    contaFran.fazTransferencia(contaAlex, 59.0)

    println("Saldo Fran: ${contaFran.saldo}")
    println("Saldo Alex: ${contaAlex.saldo}")
}