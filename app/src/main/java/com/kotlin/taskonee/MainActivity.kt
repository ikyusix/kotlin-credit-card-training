package com.kotlin.taskonee

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }

    fun getData(view : View){
        val nameCard = findViewById<EditText>(R.id.yName).text.toString()
        val numberCard = findViewById<EditText>(R.id.yNumber).text.toString()

        val newIntent = Intent(this, SecondActivity::class.java).apply {
            putExtra("name", nameCard)
            putExtra("number", numberCard)
        }
        startActivity(newIntent)
    }
}