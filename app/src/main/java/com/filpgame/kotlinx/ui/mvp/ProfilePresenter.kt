package com.filpgame.kotlinx.ui.mvp

import android.annotation.SuppressLint

/**
 * @author Felipe Rodrigues
 * @since 12/02/2017
 */
class ProfilePresenter(val view: ProfileView) {

    @SuppressLint("SetTextI18n")
    fun initView() {
        view.firstNameTextView.text = "Felipe"
        view.lastNameTextView.text = "Rodrigues"
        view.birthDateTextView.text = "12/12/1993"
        view.occupationTextView.text = "Developer"
    }
}