package com.filpgame.kotlinx.widget

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import com.filpgame.kotlinx.R
import kotlinx.android.synthetic.main.widget_infoblockview.view.*

/**
 * Classe
 * @author frodrigues
 * @since 2017-02-13
 */
class TitleDescView : LinearLayout {
    var desc: CharSequence
        get() = valueTextView.text
        set(value) {
            valueTextView.text = value
        }
    
    var title: CharSequence
        get() = titleTextView.text
        set(value) {
            titleTextView.text = value
        }

    init {
        LinearLayout.inflate(context, R.layout.widget_infoblockview, this)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        setAttributes(attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        setAttributes(attrs)
    }

    private fun setAttributes(attributeSet: AttributeSet) {
        val args = context.theme.obtainStyledAttributes(attributeSet, R.styleable.TitleDescView, 0, 0)
        titleTextView.text = args.getString(R.styleable.TitleDescView_tdv_title)
        valueTextView.text = args.getString(R.styleable.TitleDescView_tdv_desc)
        args.recycle()
    }
}