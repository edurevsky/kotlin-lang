class CalculadoraDeBonificacao {

    var total: Double = 0.0
        private set

    fun registraFuncionario(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }
}