package com.filpgame.kotlinx.ui.mvp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import com.filpgame.kotlinx.R
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.activity_profile.firstNameTextView as firstNameTextViewProfile
import kotlinx.android.synthetic.main.activity_profile.pictureImageView as pictureImageViewProfile

class ProfileActivity : AppCompatActivity(), ProfileView {
    val presenter = ProfilePresenter(this)

    override val profileImageView: ImageView
        get() = pictureImageViewProfile

    override val firstNameTextView: TextView
        get() = firstNameTextViewProfile

    override val lastNameTextView: TextView
        get() = last_name_textview

    override val birthDateTextView: TextView
        get() = birth_date_textview

    override val occupationTextView: TextView
        get() = occupation_textview

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        presenter.initView()
    }
}
