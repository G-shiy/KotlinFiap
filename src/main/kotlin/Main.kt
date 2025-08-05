package org.fiap

fun main() {
    println("Hello, World!")
    println("##########################################################")
    println("Tipos")
    println("${Byte.SIZE_BITS} ${Byte.SIZE_BYTES} ${Byte.MIN_VALUE}")
    Types()
    println("##########################################################")
    println("Classes")
    val person = Person("John", 32)
    println("$person ${person.name} ${person.age}")
    person.name = "Robert"
    println("$person ${person.name} ${person.age}")

    println("##########################################################")
    Strings()

    println("##########################################################")
    println("Nullable - Null Safety")
    Nullable()
    println("##########################################################")

    println("Colections & Arrays")

}