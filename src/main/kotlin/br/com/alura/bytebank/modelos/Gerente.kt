package br.com.alura.bytebank.modelos

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    private val senha: String
) : Funcionario(nome, cpf, salario), Autenticavel {

    override val bonificacao: Double
        get() = salario

    override fun autentica(senha: String): Boolean {
        return this.senha == senha
    }
}