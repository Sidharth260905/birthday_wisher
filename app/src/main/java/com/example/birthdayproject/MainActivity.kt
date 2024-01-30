package com.example.birthdayproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.etname)
        val button = findViewById<Button>(R.id.btn)
        button.setOnClickListener{
            val name: String = editText.text.toString()
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("Name", name)
            startActivity(intent)
        }


    }
}