package org.fiap

class Person(val name: String, val age: Int){
    constructor() :this("Nome Inválido", 0)
    init {
        println("Person created with name $name and age $age")
    }
}

