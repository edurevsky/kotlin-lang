package br.com.alura.bytebank.modelos

abstract class ContaTransferivel(
    titular: Cliente,
    numero: Int
) : Conta(titular, numero), Transferivel {

    override fun fazTransferencia(destino: Conta, valor: Double): Boolean {
        if (valor > this.saldo)
            return false
        this.saldo -= valor
        destino.fazDeposito(valor)
        println("Transferência de $valor (${titular.nome} -> ${destino.titular.nome})")
        return true
    }
}