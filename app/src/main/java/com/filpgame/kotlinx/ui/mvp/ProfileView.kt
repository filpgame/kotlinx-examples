package com.filpgame.kotlinx.ui.mvp

import android.widget.ImageView
import android.widget.TextView

/**
 * @author Felipe Rodrigues
 * @since 12/02/2017
 */
interface ProfileView {
    val profileImageView: ImageView
    val firstNameTextView: TextView
    val lastNameTextView: TextView
    val birthDateTextView: TextView
    val occupationTextView: TextView
}