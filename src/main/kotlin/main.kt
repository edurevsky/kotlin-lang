fun main() {
    println("Bem vindo ao Bytebank!")

    // Utilizamos var para indicar que o valor da variável é mutável
    // ou val, onde o seu valor é imutável.
    // Também não precisamos deixar explícito o tipo (int, string) da variável.
    val titular: String = "João"
    val numeroDaConta: Int = 4242
    var saldo = 0.0
    saldo = 100.0
    saldo += 200

    // Template String
    println("Titular: $titular\n" +
            "Número da conta: $numeroDaConta\n" +
            "Saldo da conta: $saldo")
}