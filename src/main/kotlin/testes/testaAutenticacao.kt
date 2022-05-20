import modelos.Cliente
import modelos.Diretor
import modelos.Gerente
import modelos.SistemaInterno

fun testaAutenticacao() {
    val sistemaInterno = SistemaInterno()

    val diretor = Diretor(
        nome = "modelos.Diretor",
        cpf = "123.456.789-10",
        salario = 1000.0,
        plr = 100.0,
        senha = "umasenha"
    )

    val gerente = Gerente(
        nome = "modelos.Gerente",
        cpf = "123.456.789-10",
        salario = 4000.0,
        senha = "42"
    )

    val cliente = Cliente(
        nome = "modelos.Cliente",
        cpf = "012.345.678-90",
        senha = "123456"
    )

    sistemaInterno.autentica(cliente, "123")
    sistemaInterno.autentica(gerente, "42")
    sistemaInterno.autentica(diretor, "umasenha")
}