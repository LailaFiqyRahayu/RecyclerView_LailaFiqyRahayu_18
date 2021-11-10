package com.example.recyclerview_lailafiqyrahayu_18

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailFotoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_foto)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val foto = intent.getParcelableExtra<Foto>(MainActivity.INTENT_PARCELABLE)

        val imgfoto = findViewById<ImageView>(R.id.img_item_photo)
        val namefoto = findViewById<TextView>(R.id.tv_item_name)
        val descfoto = findViewById<TextView>(R.id.tv_item_description)

        imgfoto.setImageResource(foto?.imgfoto!!)
        namefoto.text = foto.namefoto
        descfoto.text = foto.descfoto
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}