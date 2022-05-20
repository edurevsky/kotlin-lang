package br.com.alura.bytebank.modelos

class Endereco(
    var logradouro: String = "",
    var numero: Int = 0,
    var bairro: String = "",
    var cidade: String = "",
    var estado: String = "",
    var cep: String = "",
    var complemento: String = ""
) {
    fun mostraEndereco() {
        println("CEP: $cep")
        println("Logradouro: $logradouro")
        println("Numero: $numero")
        println("Complemento: $complemento")
    }
}
