package org.fiap

fun main() {
    println("Hello, World!")

    println("Tipos")
    println("${Byte.SIZE_BITS} ${Byte.SIZE_BYTES} ${Byte.MIN_VALUE}")
    types()

    println("Classes")
    val person = Person("John", 32)
    println("$person ${person.name} ${person.age}")
    person.name = "Robert"
    println("$person ${person.name} ${person.age}")


}