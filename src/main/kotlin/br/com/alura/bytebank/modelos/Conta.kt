package br.com.alura.bytebank.modelos

abstract class Conta(
    val titular: Cliente,
    val numero: Int
) : Autenticavel by titular {

    var saldo = 0.0
        protected set

    companion object {
        var totalContas = 0
            private set
    }

    init {
        totalContas++
    }

    fun fazDeposito(valor: Double) {
        if (valor <= 0) {
            return
        }
        println("Deposito de $$valor na conta de ${titular.nome}...")
        this.saldo += valor
    }

    abstract fun fazSaque(valor: Double)

    override fun toString(): String {
        return "Titular: ${titular.nome}\n" +
                "${titular.endereco}" +
                "Número da conta: $numero\n" +
                "Saldo: $saldo\n"
    }
}