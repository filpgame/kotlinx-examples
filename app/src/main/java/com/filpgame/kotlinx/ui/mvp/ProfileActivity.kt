package com.filpgame.kotlinx.ui.mvp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import com.filpgame.kotlinx.R
import kotlinx.android.synthetic.main.activity_profile.birthDateTextView as _birthDateTextView
import kotlinx.android.synthetic.main.activity_profile.firstNameTextView as _firstNameTextView
import kotlinx.android.synthetic.main.activity_profile.lastNameTextView as _lastNameTextView
import kotlinx.android.synthetic.main.activity_profile.occupationTextView as _occupationTextView
import kotlinx.android.synthetic.main.activity_profile.pictureImageView as _pictureImageView

class ProfileActivity : AppCompatActivity(), ProfileView {
    val presenter = ProfilePresenter(this)

    override val pictureImageView: ImageView
        get() = _pictureImageView

    override val firstNameTextView: TextView
        get() = _firstNameTextView

    override val lastNameTextView: TextView
        get() = _lastNameTextView

    override val birthDateTextView: TextView
        get() = _birthDateTextView

    override val occupationTextView: TextView
        get() = _occupationTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        presenter.initView()
    }
}
