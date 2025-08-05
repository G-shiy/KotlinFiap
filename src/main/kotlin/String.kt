package org.fiap

import kotlin.io.path.Path

fun Strings(){
    var nome = "Celso"

    println(nome)

    nome = "Maria"

    println(nome.length)
    var cidade: String = "São Paulo"
    println("nome da cidade $cidade")

//    var nota: Char
//    var complementoNota : Char
//
//    nota = 'A'
//    complementoNota = '+'

    var (nota, complemento) = Pair('A', '+')

    println("nota na prova: $nota$complemento")

// pair pode ser feito dessa forma:

    var product: Pair<Int, String> = Pair(2, "Teclado")
    println(product)
    println("${product.first} ${product.second}")


}

