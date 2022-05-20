package br.com.alura.bytebank.modelos

abstract class Conta(
    val titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    fun fazDeposito(valor: Double) {
        if (valor <= 0) {
            return
        }
        println("Deposito de $$valor na conta de ${titular.nome}...")
        this.saldo += valor
    }

    abstract fun fazSaque(valor: Double)

    fun mostrarDados() {
        println("--------------------")
        println("Titular: ${titular.nome}")
        println("Número da conta: $numero")
        println("Saldo: $saldo")
        println("--------------------")
    }
}