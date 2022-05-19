class Cliente(
    val nome: String,
    val cpf: String,
    val senha: String
) : Autenticavel {

    override fun autentica(senha: String): Boolean {
        return senha == this.senha
    }
}