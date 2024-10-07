package com.example.rvdanlvdetailmuhammadzacky2301093019

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val tombol1: Button = findViewById(R.id.pil1)
        tombol1.setOnClickListener {
            val intent = Intent(this, list_view::class.java)
            startActivity(intent)
        }
        val tombol2: Button = findViewById(R.id.pil2)
        tombol2.setOnClickListener {
            val intent = Intent(this, rv_custom_image::class.java)
            startActivity(intent)
        }
        val tombol3: Button = findViewById(R.id.pil3)
        tombol3.setOnClickListener {
            val intent = Intent(this, rv_movie::class.java)
            startActivity(intent)
        }
    }
}