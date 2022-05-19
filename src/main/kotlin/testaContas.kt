fun testaContas() {
    val contaAlex = Conta("Alex", 1001)
    contaAlex.fazDeposito(42.0)
    contaAlex.fazDeposito(-1000.0)

    val contaFran = Conta(numero = 1002, titular = "Fran")
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