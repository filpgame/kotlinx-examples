package com.filpgame.kotlinx.ui.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.filpgame.kotlinx.R
import kotlinx.android.synthetic.main.fragment_test.*

class TestFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_test, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        //Views MUST start to be used here, when the view was actually created
        text1.text = "Kotlin"
        text2.text = "is Love"
    }
}
