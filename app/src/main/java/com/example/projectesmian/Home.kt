package com.example.projectesmian

import android.content.Intent
import android.os.Bundle
import android.os.DeadSystemException
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Home : AppCompatActivity() {

    private lateinit var sepakbolaRecyclerView : RecyclerView
    private lateinit var nama: Array<String>
    private lateinit var asal: Array<String>
    private lateinit var gambar: Array<Int>
    private lateinit var deskripsi: Array<String>
    private lateinit var listpemain: ArrayList<DataClub>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)

        gambar = arrayOf(
            R.drawable.pers,
            R.drawable.pers,
            R.drawable.pers
        )
        nama = arrayOf(
            "Persipura",
            "Persipura",
            "Persipura"

        )
        asal = arrayOf(
            "Jayapura",
            "Jayapura",
            "Jayapura"

        )

        deskripsi = arrayOf(
            getString(R.string.pers),
            getString(R.string.pers),
            getString(R.string.pers)

        )
        sepakbolaRecyclerView = findViewById(R.id.daftarClub)
        sepakbolaRecyclerView.layoutManager = LinearLayoutManager(this)

        listpemain = arrayListOf<DataClub>()
        getData()

    }

    private fun getData() {
        for ( i in gambar.indices){
            val dataBola = DataClub(gambar[i],nama[i],asal[i])
//
            listpemain.add(dataBola)



    }

        var adapter = ClubAdapter(listpemain)
        sepakbolaRecyclerView.adapter = adapter

        adapter.setOnItemClickListener(object : ClubAdapter.onItemClickListener {
            override fun onItemClick(position: Int) {
                val intent = Intent(this@Home, Deskripsi::class.java)
                intent.putExtra("img", listpemain[position].gambar)
                intent.putExtra("jdl", listpemain[position].judul)
                intent.putExtra("asl", listpemain[position].asal)
                intent.putExtra("dsk", deskripsi[position])
                startActivity(intent)
            }

        })

    }

}