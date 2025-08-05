package org.fiap

fun Types(){
    var universityName: String = "FIAP"
    println(universityName)
    universityName = "Faculdade de Informática e Administração Paulista"

    var idade: Byte = 21

    var nome : String = "Gustavo" // kotlin recomenda criar a váriavel de forma implicita ao invés de explicita da seguinte forma:
    var sobrenome = "Siqueira"

    println("${nome}, ${sobrenome}, ${idade}, ${universityName}")
}