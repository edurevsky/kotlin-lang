package br.com.alura.bytebank.testes

fun main() {
    fazLacos()
}

fun fazLacos() {
    for (i in 60 downTo 20 step 20) {
        if (i < 40) break

        // Utilizamos var para indicar que o valor da variável é mutável
        // ou val, onde o seu valor é imutável.
        // Também não precisamos deixar explícito o tipo (int, string) da variável.
        val titular: String = "João $i"
        val numeroDaConta: Int = 4242 + i
        var saldo = i + 2.0

        // Template String
        println(
                "Titular: $titular\n" +
                        "Número da conta: $numeroDaConta\n" +
                        "Saldo da conta: $saldo\n"
        )
    }
}