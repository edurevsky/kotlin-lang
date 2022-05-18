fun main() {
    println("Bem vindo ao Bytebank!")

    // Utilizamos var para indicar que o valor da variável é mutável
    // ou val, onde o seu valor é imutável.
    // Também não precisamos deixar explícito o tipo (int, string) da variável.

    for (i in 60 downTo 20 step 20) {

        if (i < 40) break

        val titular: String = "João $i"
        val numeroDaConta: Int = 4242 + i
        var saldo = i + 2.0

        // Template String
        println("Titular: $titular\n" +
                "Número da conta: $numeroDaConta\n" +
                "Saldo da conta: $saldo\n")
    }
}

fun fazCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("A Conta é positiva")
    } else if (saldo == 0.0) {
        println("A Conta é neutra")
    } else {
        println("A Conta é negativa")
    }

    when {
        saldo > 0.0 -> println("A Conta é positiva")
        saldo == 0.0 -> println("A Conta é neutra")
        else -> println("A Conta é negativa")
    }
}
