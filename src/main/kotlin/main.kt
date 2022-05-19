fun main() {
    println("Bem vindo ao Bytebank!")

    // testaContas()
    val fulano = Funcionario("Fulano", "012.345.678-90", 3000.0)

    println("Nome: ${fulano.nome}")
    println("CPF: ${fulano.cpf}")
    println("Salário: ${fulano.salario}")
    println("Bonificação: ${fulano.bonificacao}")

    val ciclano = Gerente(
        nome = "Ciclano",
        cpf = "012.345.678-90",
        salario = 4500.0,
        senha = "coxinha123"
    )
    println("Bonificação: ${ciclano.bonificacao}")

    if (ciclano.autentica("coxinha123")) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }

    val beltrano = Diretor(
        nome = "Beltrano",
        cpf = "012.345.678-90",
        salario = 6000.0,
        senha = "umasenha",
        plr = 200.0
    )

    println("Bonificação ${beltrano.bonificacao}")
}
