package org.fiap

class Person(val name: String, val age: Int){
    constructor() :this("Nome Inválido", 0)
    init {
        println("Person created with name $name and age $age")
    }
}



fun main(args: Array<String>) {
    println("Hello, World!")

    println("Tipos")
    println("${Byte.SIZE_BITS} ${Byte.SIZE_BYTES} ${Byte.MIN_VALUE}")
    types()

    println("Classes")
    var person = Person("John", 32)
    println("${person} ${person.name} ${person.age}")

}