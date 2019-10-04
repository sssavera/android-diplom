package com.example.fairytale_quest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main5.*

class Main5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val actionBar = supportActionBar
        actionBar!!.hide()
        button5.setOnClickListener {
            imageView.visibility = View.GONE
            imageView2.visibility = View.GONE
            imageView3.visibility = View.GONE
            imageView4.visibility = View.GONE
            imageView5.visibility = View.GONE
            imageView6.visibility = View.GONE
        }

    }
}