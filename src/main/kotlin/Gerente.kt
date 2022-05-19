class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome, cpf, salario), Autenticavel {

    override fun autentica(senha: String): Boolean {
        return senha == this.senha
    }

    override val bonificacao: Double
        get() = salario
}