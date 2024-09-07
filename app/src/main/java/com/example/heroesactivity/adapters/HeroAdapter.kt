package com.example.heroesactivity.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.heroesactivity.R
import com.example.heroesactivity.models.Character

class HeroesAdapter(private val heroesList: List<Character>) : RecyclerView.Adapter<HeroesAdapter.HeroViewHolder>() {

    // ViewHolder: mantiene las vistas para cada elemento
    class HeroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val heroName: TextView = itemView.findViewById(R.id.heros_name)
    }

    // Infla el layout para cada ítem
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.hero_item, parent, false)
        return HeroViewHolder(view)
    }

    // Vincula los datos con las vistas
    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        holder.heroName.text = heroesList[position].name
    }

    // Devuelve la cantidad de elementos en la lista
    override fun getItemCount(): Int {
        return heroesList.size
    }
}
