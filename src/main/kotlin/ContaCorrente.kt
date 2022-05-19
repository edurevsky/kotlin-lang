class ContaCorrente(
    titular: String,
    numero: Int
) : ContaTransferivel(titular, numero) {

    override fun fazSaque(valor: Double) {
        val valorComTaxa = valor + 0.1
        // super.fazSaque(valorComTaxa)
        if (valorComTaxa > this.saldo) return
        this.saldo -= valorComTaxa
    }

    override fun fazTransferencia(destino: Conta, valor: Double): Boolean {
        if (valor > this.saldo) return false
        this.saldo -= valor
        destino.fazDeposito(valor)
        return true
    }
}