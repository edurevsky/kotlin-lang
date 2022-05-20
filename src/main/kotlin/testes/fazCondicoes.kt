fun main() {
    fazCondicoes(0.0)
}

fun fazCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("A modelos.Conta é positiva")
    } else if (saldo == 0.0) {
        println("A modelos.Conta é neutra")
    } else {
        println("A modelos.Conta é negativa")
    }

    when {
        saldo > 0.0 -> println("A modelos.Conta é positiva")
        saldo == 0.0 -> println("A modelos.Conta é neutra")
        else -> println("A modelos.Conta é negativa")
    }
}