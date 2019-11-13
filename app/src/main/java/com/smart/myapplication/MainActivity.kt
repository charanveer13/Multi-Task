package com.smart.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.smartitventures.mylibrary.IntroActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            startActivity(Intent(this@MainActivity, IntroActivity::class.java))
        }
    }
}
