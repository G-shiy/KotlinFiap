package org.fiap

class Person(var name: String, var age: Int){
    constructor() :this("Nome Inválido", 0)
    init {
        println("Person created with name $name and age $age")
    }
}

