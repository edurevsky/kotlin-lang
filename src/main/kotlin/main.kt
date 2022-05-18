fun main() {
    println("Bem vindo ao Bytebank!")

    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1001
    contaAlex.saldo = 42.0

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1002
    contaFran.saldo = 300.0

    contaAlex.mostrarDados()
    contaFran.mostrarDados()
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun mostrarDados() {
        println("--------------------")
        println("Titular: $titular")
        println("Número da Conta: $numero")
        println("Saldo: $saldo")
        println("--------------------")
    }
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
