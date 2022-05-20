package br.com.alura.bytebank.modelos

class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {

    override val bonificacao: Double
        get() = salario * .05
}