package com.example.recyclerview_lailafiqyrahayu_18

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FotoAdapter(private val context: Context, private val students: List<Foto>, val listener: (Foto) -> Unit)
    : RecyclerView.Adapter<FotoAdapter.FotoViewHolder>() {
    class FotoViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imgfoto = view.findViewById<ImageView>(R.id.img_item_photo)
        val namefoto = view.findViewById<TextView>(R.id.tv_item_name)
        val descfoto = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(foto: Foto, listener: (Foto) -> Unit) {
            imgfoto.setImageResource(foto.imgfoto)
            namefoto.text = foto.namefoto
            descfoto.text = foto.descfoto
            itemView.setOnClickListener{
                listener(foto)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FotoViewHolder {
        return FotoViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_foto, parent, false)
        )
    }

    override fun onBindViewHolder(holder: FotoViewHolder, position: Int) {
        holder.bindView(students[position], listener)
    }

    override fun getItemCount(): Int {
        return students.size
    }
}