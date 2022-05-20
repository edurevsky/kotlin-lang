package br.com.alura.bytebank.modelos

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : ContaTransferivel(titular, numero) {

    override fun fazSaque(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (valorComTaxa > this.saldo)
            return
        println("Saque de $$valor na conta de ${titular.nome}")
        this.saldo -= valorComTaxa
    }
}