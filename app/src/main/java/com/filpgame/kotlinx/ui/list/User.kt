package com.filpgame.kotlinx.ui.list

import java.security.SecureRandom

fun <T> Array<T>.random(): T {
    return this[SecureRandom().nextInt(this.count())]
}

val names = arrayOf("Felipe", "Cicrano", "Pedro", "Thiago", "John", "Fulano", "Beltrano")
val occupations = arrayOf("Developer", "Engineer", "QA", "Manager", "Driver", "Seller", "Customer Relationship")

data class User(val name: String = names.random(), val occupation: String = occupations.random())