package com.example.heroesactivity.ui

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesactivity.R
import com.example.heroesactivity.adapters.HeroesAdapter
import com.example.heroesactivity.models.Character

class MarvelActivity : AppCompatActivity(){
    lateinit var herosRecyclerView: RecyclerView
    lateinit var back : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_marvel)

        herosRecyclerView = findViewById(R.id.heroesRecyclerView)

        val filteredCharacters = Character.chara.filter { it.PublisherId == 1 }

        herosRecyclerView.adapter = HeroesAdapter(filteredCharacters)
        //herosRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        herosRecyclerView.layoutManager = GridLayoutManager(this, 2)  // 2 columnas

        back = findViewById(R.id.back)

        back.setOnClickListener{
            val intent = Intent(this@MarvelActivity,HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}
