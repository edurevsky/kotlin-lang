class ContaSalario(
    titular: String,
    numero: Int
) : Conta(titular, numero) {

    override fun fazSaque(valor: Double) {
        if (valor > this.saldo) {
            return
        }
        this.saldo -= valor
    }
}