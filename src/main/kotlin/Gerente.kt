class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome, cpf, salario) {

    fun autentica(senha: String): Boolean {
        return senha == this.senha
    }

//    fun bonificacao(): Double {
//        return salario * .2
//    }
}