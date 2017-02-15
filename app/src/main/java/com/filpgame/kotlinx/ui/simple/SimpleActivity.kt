package com.filpgame.kotlinx.ui.simple

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.filpgame.kotlinx.R
import kotlinx.android.synthetic.main.activity_simple.*

class SimpleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple)
        textView.text = "Hello Kotlinx"
    }

}
