package com.filpgame.kotlinx.ui.list

import android.R.drawable.*
import java.security.SecureRandom

fun <T> Array<T>.random(): T = this[SecureRandom().nextInt(this.count())]

val pictures = arrayOf(ic_media_play, ic_delete, ic_lock_lock, ic_dialog_map, ic_lock_power_off, ic_menu_zoom, ic_input_add)
val names = arrayOf("Felipe", "Cicrano", "Pedro", "Thiago", "John", "Fulano", "Beltrano")
val occupations = arrayOf("Developer", "Engineer", "QA", "Manager", "Driver", "Seller", "Customer Relationship")

data class User(
        val name: String = names.random(),
        val occupation: String = occupations.random(),
        val picture: Int = pictures.random()
)