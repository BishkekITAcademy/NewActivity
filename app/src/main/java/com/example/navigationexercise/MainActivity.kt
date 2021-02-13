package com.example.navigationexercise

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.midButton)
        button.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)

            val int1 = 1
            val int2 = 7

            intent.putExtra("first", int1)
            intent.putExtra("second", int2)

            startActivity(intent)
        }
    }
}