package com.filpgame.kotlinx.ui

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.filpgame.kotlinx.R
import com.filpgame.kotlinx.ui.customview.CustomViewActivity
import com.filpgame.kotlinx.ui.fragment.TestActivity
import com.filpgame.kotlinx.ui.list.UsersActivity
import com.filpgame.kotlinx.ui.mvp.ProfileActivity
import com.filpgame.kotlinx.ui.simple.SimpleActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listButton.setOnClickListener { startActivity(UsersActivity::class.java) }
        mvpButton.setOnClickListener { startActivity(ProfileActivity::class.java) }
        simpleButton.setOnClickListener { startActivity(SimpleActivity::class.java) }
        fragmentButton.setOnClickListener { startActivity(TestActivity::class.java) }
        customViewButton.setOnClickListener { startActivity(CustomViewActivity::class.java) }
    }

    fun startActivity(activity: Class<*>) {
        startActivity(Intent(this, activity))
    }
}
