package com.example.lab3parte2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PersonasAdapter (ctx: Context, private val personasList:List<Persona>) :RecyclerView.Adapter<PersonasAdapter.PersonasViewHolder> () {

    inner class PersonasViewHolder(itemsView: View):RecyclerView.ViewHolder(itemsView) {
        var image = itemsView.findViewById<ImageView>(R.id.imgLogo)
        var nombre = itemsView.findViewById<TextView>(R.id.txtNombre)
        var apellido = itemsView.findViewById<TextView>(R.id.txtApellido)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonasViewHolder {
        val v = LayoutInflater.from (parent.context).inflate(R.layout.item_persona,parent,false)
        return PersonasViewHolder(v)
    }

    override fun getItemCount(): Int {
        return personasList.size
    }

    override fun onBindViewHolder(holder: PersonasViewHolder, position: Int) {
        val i = personasList[position]
        holder.nombre.text = i.nombre
        holder.apellido.text = i.apellido

        Glide.with(holder.itemView.context)
            .load(i.imagen
                ,)
            .centerCrop()
            //.placeholder(R.drawable.loading_spinner)
            .into(holder.image)

    }
}