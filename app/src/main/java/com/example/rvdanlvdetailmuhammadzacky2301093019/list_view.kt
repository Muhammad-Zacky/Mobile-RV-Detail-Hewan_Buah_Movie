package com.example.rvdanlvdetailmuhammadzacky2301093019

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class list_view : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)
        val lv_item = findViewById<ListView>(R.id.lvHewan)
        val namahewan = listOf("Beruang", "Elang", "Harimau","Lele", "Lutung", "Ayam")

        val gambarHewanMap = mapOf(
            "Beruang" to R.drawable.beruang,
            "Elang" to R.drawable.elang,
            "Harimau" to R.drawable.harimau,
            "Lele" to R.drawable.lele,
            "Lutung" to R.drawable.lutung,
            "Ayam" to R.drawable.ayam
        )
        lv_item.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, namahewan)


        lv_item.setOnItemClickListener(){_, _, position, _ ->
            val selectedHewan = namahewan[position]
            Toast.makeText(this,"Anda memilih:$selectedHewan", Toast.LENGTH_SHORT).show()

            //intent ke detail activity

            val intent = Intent(this,detail_hewan::class.java)
            intent.putExtra("namaHewan",selectedHewan)
            intent.putExtra("gambarHewan",gambarHewanMap[selectedHewan] ?:0)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}