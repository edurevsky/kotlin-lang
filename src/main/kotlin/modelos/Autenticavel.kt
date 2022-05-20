package modelos

interface Autenticavel {

    fun autentica(senha: String): Boolean
}