package com.filpgame.kotlinx.ui.customview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.filpgame.kotlinx.R
import kotlinx.android.synthetic.main.activity_custom_view.*

class CustomViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_view)

        firstTitleDescView.title = "Custom"
        firstTitleDescView.desc = "Example"

        secondTitleDescView.title = "With"
        secondTitleDescView.desc = "Kotlin"

        thirdTitleDescView.title = "And"
        thirdTitleDescView.desc = "Synthetic Properties"
    }
}
