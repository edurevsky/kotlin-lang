class SistemaInterno {

    fun autentica(autenticavel: Autenticavel, senha: String) {
        if (autenticavel.autentica(senha)) {
            println("Autenticação com sucesso")
            return
        }
        println("Autenticação sem sucesso")
    }

}