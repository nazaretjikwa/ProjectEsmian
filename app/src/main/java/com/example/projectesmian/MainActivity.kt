package com.example.projectesmian

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.projectesmian.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.Mlogin.setOnClickListener()
        {
            val intenhome = Intent(this, Home::class.java)
            startActivity(intenhome)
        }

       binding.lupapassword.setOnClickListener()
        {
            val intentlupasandi = Intent(this,lupapasword::class.java)
            startActivity(intentlupasandi)
        }
        binding.register.setOnClickListener()
        {
           val intentregistrasi = Intent(this, Register::class.java)
            startActivity(intentregistrasi)
     }


    }
}