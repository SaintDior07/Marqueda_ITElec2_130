package com.example.myapplication


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button


class SecondActivity : AppCompatActivity() {



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second);

        val button = findViewById<Button>(R.id.btn)
        button.setOnClickListener{
            val intent = Intent(this, thirdActivity::class.java)
            startActivity(intent)
        }

    }
}