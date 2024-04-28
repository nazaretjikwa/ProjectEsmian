package com.example.projectesmian

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Deskripsi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_deskripsi)

        val gambar : ImageView = findViewById(R.id.my_gambar)
        val nama : TextView = findViewById(R.id.namaclub)
        val asalc : TextView = findViewById(R.id.asalclub)
        val desk : TextView = findViewById(R.id.deskripsi)


        val bundle: Bundle?= intent.extras
        val bJudul = bundle!!.getString("jdl")
        val bGambar = bundle.getInt("img")
        val  bAyat = bundle.getString("ayt")
        val bDetail = bundle.getString("dtl")
    }
}