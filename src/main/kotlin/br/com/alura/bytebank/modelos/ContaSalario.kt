package br.com.alura.bytebank.modelos

class ContaSalario(
    titular: Cliente,
    numero: Int
) : Conta(titular, numero) {

    override fun fazSaque(valor: Double) {
        if (valor > this.saldo) {
            return
        }
        println("Saque de $$valor na conta de ${titular.nome}")
        this.saldo -= valor
    }
}