package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.widget.Button
//import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0

        button_increment.setOnClickListener {
            count++
            increment_textview.text = count.toString()
        }

    }
}