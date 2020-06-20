package com.kotlin.taskonee

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)

        val nameCard = intent.getStringExtra("name")
        val numberCard = intent.getStringExtra("number")

        val viewName = findViewById<TextView>(R.id.name_card)
        val viewNumber = findViewById<TextView>(R.id.number_card)
        viewName.text = nameCard
        viewNumber.text = numberCard
    }
}