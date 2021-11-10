package com.example.recyclerview_lailafiqyrahayu_18

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fotoList = listOf<Foto>(
            Foto(
                R.drawable.Laila,
                "Laila",
                "KELAS XI RPL 3"
            ),
            Foto(
                R.drawable.Meiwil,
                "Meiwildan",
                "KELAS XI RPL 3"
            ),
            Foto(
                R.drawable.Patria,
                "Patria",
                "KELAS XI RPL 3"
            ),
            Foto(
                R.drawable.Rifqi,
                "Rifqi",
                "KELAS XI RPL 3"
            )
        )
        val recyclerView= findViewById<RecyclerView>(R.id.rv_foto)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = FotoAdapter(this, fotoList){
            val intent = Intent (this, DetailFotoActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE,it)
            startActivity(intent)
        }
    }
}