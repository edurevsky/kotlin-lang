package br.com.alura.bytebank.modelos

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : ContaTransferivel(titular, numero) {

    override fun fazSaque(valor: Double) {
        if (valor > this.saldo)
            return
        println("Saque de $$valor na conta de ${titular.nome}")
        this.saldo -= valor
    }
}