class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String,
    val plr: Double
) : Funcionario(nome, cpf, salario), Autenticavel {

    override fun autentica(senha: String): Boolean {
        return senha == this.senha
    }

    override val bonificacao: Double
        get() = (salario * .08) + plr
}