package modelos

import modelos.Autenticavel
import modelos.Funcionario

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    private val senha: String,
    val plr: Double
) : Funcionario(nome, cpf, salario), Autenticavel {

    override val bonificacao: Double
        get() = (salario * .08) + plr

    override fun autentica(senha: String): Boolean {
        return this.senha == senha
    }
}