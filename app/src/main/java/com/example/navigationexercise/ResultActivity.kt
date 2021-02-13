package com.example.navigationexercise

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val int1 = intent.getIntExtra("first", 0)
        val int2 = intent.getIntExtra("second", 0)

        val textView = findViewById<TextView>(R.id.resultTextView)

        val result = int1 + int2
        textView.text = result.toString()

    }
}