fun main() {
    println("Bem vindo ao Bytebank!")

    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1001
    contaAlex.setSaldo(42.0)
    contaAlex.setSaldo(-1000.0)

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1002
    contaFran.setSaldo(300.0)

    contaAlex.mostrarDados()
    contaFran.mostrarDados()

    contaAlex.fazDeposito(90.0)
    println("Novo saldo de Alex: ${contaAlex.getSaldo()}")

    contaFran.fazDeposito(10.0)
    println("Novo saldo de Fran: ${contaFran.getSaldo()}")

    contaAlex.fazSaque(40.0)
    println("Novo saldo de Alex: ${contaAlex.getSaldo()}")

    contaFran.fazSaque(250.0)
    println("Novo saldo de Fran: ${contaFran.getSaldo()}")

    contaAlex.fazSaque(500.0)
    println("Saldo Alex: ${contaAlex.getSaldo()}")

    contaFran.fazSaque(61.0)
    println("Saldo Fran: ${contaFran.getSaldo()}")

    contaFran.fazTransferencia(contaAlex, 59.0)

    println("Saldo Fran: ${contaFran.getSaldo()}")
    println("Saldo Alex: ${contaAlex.getSaldo()}")
}

class Conta {
    var titular = ""
    var numero = 0
    private var saldo = 0.0

    fun fazDeposito(valor: Double) {
        println("Deposito na conta de $titular...")
        this.saldo += valor
    }

    fun fazSaque(valor: Double) {
        if (valor > this.saldo) {
            println("Saque em excesso na conta de $titular...")
            return
        }
        println("Saque na conta de $titular...")
        this.saldo -= valor
    }

    fun fazTransferencia(destino: Conta, valor: Double): Boolean {
        if (valor > this.saldo) {
            println("Transferência mal sucedida de $$valor " +
                    "($titular -> ${destino.titular})")
            return false
        }
        println("Transferência bem sucedida de $$valor " +
                "($titular -> ${destino.titular})")
        this.saldo -= valor
        destino.fazDeposito(valor)
        return true
    }

    fun getSaldo(): Double {
        return saldo
    }

    fun setSaldo(valor: Double) {
        if (valor <= 0) {
            return
        }
        this.saldo = valor
    }

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
