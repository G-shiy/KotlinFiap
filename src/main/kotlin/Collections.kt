package org.fiap

import kotlin.reflect.typeOf

fun Collections(){
//var city = arrayOf("São Paulo", "Rio de Janeiro", "Curitiba", 100) não define o tipo do array, ou seja nao fala os erros que ele pode contar
    var city = arrayOf<String>("São Paulo", "Rio de Janeiro", "Curitiba")
    println("cidade: ${city.joinToString()}, Tipo: ${city::class}")

    println("${city[1]}")
    var temCidade = city.isEmpty()
    println(temCidade) // retorna falso pois não está vazio
}