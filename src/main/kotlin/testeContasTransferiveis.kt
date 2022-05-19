fun testeContasTransferiveis() {

    val contaCorrente = ContaCorrente(
        titular = "João",
        numero = 8217
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Mari",
        numero = 4242
    )

    val contaSalario = ContaSalario(
        titular = "Mário",
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