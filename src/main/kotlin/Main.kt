package org.fiap

import classes.Person
import org.fiap.classes.Employee
import java.time.LocalDate

fun clearTerminal() {
    println("Pressione ENTER para simular limpeza...")
    readln()
    repeat(15) { println() }
}

fun main() {
    println("Hello, World!")
    println("##########################################################")
    println("Tipos")
    println("${Byte.SIZE_BITS} ${Byte.SIZE_BYTES} ${Byte.MIN_VALUE}")
    Types()


    println("##########################################################")
    clearTerminal()
    Strings()

    println("##########################################################")
    clearTerminal()
    println("Nullable - Null Safety")
    Nullable()
    println("##########################################################")
    clearTerminal()
    println("Collections & Arrays")
    Collections()

    println("##########################################################")
    clearTerminal()
    println("Classes")
    val person = Person("John", LocalDate.of(2004, 3, 22), "São Paulo")
    println("$person ${person.getName()} ${person.age}")
    person.updateName("Roberto")
    println("$person ${person.getName()} ${person.age}")
    person.displayInfo()

    val person2 = Person("Alice", LocalDate.of(2004, 3, 22), "New York")

    person2.displayInfo()

    println("##########################################################")
    clearTerminal()
    println("Classes - Herança")

    val employee = Employee("Carlos", LocalDate.of(2000, 5, 15), "Rio de Janeiro")
    employee.displayInfo()
    employee.updateName("Carlos Silva")



}