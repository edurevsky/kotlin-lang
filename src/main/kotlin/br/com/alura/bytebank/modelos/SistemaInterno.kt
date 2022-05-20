package br.com.alura.bytebank.modelos

class SistemaInterno {

    fun autentica(autenticavel: Autenticavel, senha: String) {
        if (!autenticavel.autentica(senha)) {
            println("Autenticação sem sucesso")
            return
        }
        println("Autenticação com sucesso")
    }

}