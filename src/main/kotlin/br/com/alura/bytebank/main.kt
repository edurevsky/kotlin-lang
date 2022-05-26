package br.com.alura.bytebank

fun main() {
    println("Início do main")
    funcao1()
    println("Fim do main")
}

fun funcao1() {
    println("Início da função 1")
    funcao2()
    println("Fim da função 1")
}

fun funcao2() {
    println("Início da função 2")
    for (i in 1..5) {
        println(i)
    }
    println("Fim da função 2")
}