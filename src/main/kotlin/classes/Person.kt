package classes

import java.time.LocalDate
import java.time.Period

open class Person(
    private var name: String = "Unknown",
    private val birthDate: LocalDate = LocalDate.of(2004, 3, 22),
    private var city: String = "Unknown",
) {
    val age: Int
        get() {
            return Period.between(birthDate, LocalDate.now()).years
        }

    fun getName(): String = name
    fun updateName(novoNome: String) {
        if (novoNome.length >= 2) {
            name = novoNome
        } else {
            println("Nome inválido.")
        }
    }

    init {
        println("Person initialized with name $name and age $age")
    }

    fun displayInfo() {
        println("Name: $name, Age: $age from birth date $birthDate, City: $city")
    }
}
