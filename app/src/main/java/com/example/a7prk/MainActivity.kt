package com.example.a7prk

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private var counter: Int = 0
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        btn.setOnClickListener{
            textView.text = "Hello, friend"
        }
        val buttonCounter = findViewById<Button>(R.id.button_counter)
        buttonCounter.setOnClickListener{
            textView.text = "Я нажал кнопку ${++counter} раз"
        }
    }
}