package com.example.birthdayproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var greet: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val nnn = intent.getStringExtra("Name")
        greet = findViewById<TextView>(R.id.show)
        greet.text = nnn
    }
}