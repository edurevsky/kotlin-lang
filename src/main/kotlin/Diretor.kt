class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String,
    val plr: Double
) : Funcionario(nome, cpf, salario) {

    fun autentica(senha: String): Boolean {
        return senha == this.senha
    }

    override val bonificacao: Double
        get() = super.bonificacao + salario + plr
}