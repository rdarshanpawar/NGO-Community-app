package com.example.myngoapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.postButton)
        button.setOnClickListener {
            val intent = Intent( this, MainActivity2::class.java)
            startActivity(intent)
            val button = findViewById<Button>(R.id.postButton2)
            button.setOnClickListener {
                val intent = Intent( this, MainActivity3::class.java)
                startActivity(intent)
                val button = findViewById<Button>(R.id.postButton3)
                button.setOnClickListener {
                    val intent = Intent( this, MainActivity4::class.java)
                    startActivity(intent)
                }
            }
        }
    }

}