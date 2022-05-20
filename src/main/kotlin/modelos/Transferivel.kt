package modelos

interface Transferivel {

    fun fazTransferencia(destino: Conta, valor: Double): Boolean
}