package br.com.alura.bytebank.modelos

class ContaPoupanca(
    titular: String,
    numero: Int
) : ContaTransferivel(titular, numero) {

    override fun fazSaque(valor: Double) {
        if (valor > this.saldo) return
        this.saldo -= valor
    }

    override fun fazTransferencia(destino: Conta, valor: Double): Boolean {
        if (valor > this.saldo) return false
        this.saldo -= valor
        destino.fazDeposito(valor)
        return true
    }
}