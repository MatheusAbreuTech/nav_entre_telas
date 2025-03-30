package com.example.nav_entre_telas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SecundaActivity : AppCompatActivity() {
    lateinit var btnVoltar: Button
    lateinit var btnAvancar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_secunda)

        btnAvancar = findViewById(R.id.btnPagina3)
        btnVoltar = findViewById(R.id.btnVoltar)

        btnVoltar.setOnClickListener {
            val intent = Intent(
                this,
                MainActivity::class.java
            )
            startActivity( intent )
        }
        btnAvancar.setOnClickListener {
            val intent = Intent(
                this,
                TerceiraActivity::class.java
            )
            startActivity( intent )
        }
    }
}