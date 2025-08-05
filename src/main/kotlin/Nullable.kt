package org.fiap

// Kotlin diferente de java aceita valores nulos desde que avise anteriormente que o valor pode ser nulo

fun Nullable(){
    /*
    var age: Int
    println(age)
    isso não funciona, pois não há valor definido
     */

    var age: Int? = null // precisa-se definir que o valor é nulo
    println(age)
    age = 21
    println(age)
    age = null
    println(age)
}