package com.example.nav_entre_telas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var buttonT1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        buttonT1 = findViewById(R.id.btnAvancar)
        buttonT1.setOnClickListener {
            val intent = Intent(
                this,
                SecundaActivity::class.java
            )
            startActivity( intent )
        }
    }
}