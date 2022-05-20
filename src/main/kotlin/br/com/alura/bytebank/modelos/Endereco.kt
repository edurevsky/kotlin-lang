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

    override fun toString(): String {
        return "CEP: $cep\n" +
                "Logradouro: $logradouro\n" +
                "Numero: $numero\n" +
                "Complemento: $complemento\n"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Endereco

        if (cep != other.cep) return false

        return true
    }

    override fun hashCode(): Int {
        return cep.hashCode()
    }
}
