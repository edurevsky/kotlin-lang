package br.com.alura.bytebank.modelos

interface Autenticavel {

    fun autentica(senha: String): Boolean
}