class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun fazSaque(valor: Double) {
        if (valor > this.saldo) return
        this.saldo -= valor
    }
}