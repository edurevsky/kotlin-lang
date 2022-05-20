package br.com.alura.bytebank.modelos

class Cliente(
    val nome: String,
    val cpf: String,
    private val senha: String,
    var endereco: Endereco = Endereco()
) : Autenticavel {

    override fun autentica(senha: String): Boolean {
        return this.senha == senha
    }
}