abstract class Conta(
    val titular: String,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    fun fazDeposito(valor: Double) {
        if (valor <= 0) {
            return
        }
        println("Deposito de $$valor na conta de $titular...")
        this.saldo += valor
    }

    abstract fun fazSaque(valor: Double)

    fun fazTransferencia(destino: Conta, valor: Double): Boolean {
        if (valor > this.saldo) {
            println(
                "Transferência mal sucedida de $$valor " +
                        "($titular -> ${destino.titular})"
            )
            return false
        }
        println(
            "Transferência bem sucedida de $$valor " +
                    "($titular -> ${destino.titular})"
        )
        this.saldo -= valor
        destino.fazDeposito(valor)
        return true
    }

    fun mostrarDados() {
        println("--------------------")
        println("Titular: $titular")
        println("Número da Conta: $numero")
        println("Saldo: $saldo")
        println("--------------------")
    }
}