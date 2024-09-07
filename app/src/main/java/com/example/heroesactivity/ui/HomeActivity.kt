package com.example.heroesactivity.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesactivity.MainActivity
import com.example.heroesactivity.R
import com.example.heroesactivity.adapters.HeroesAdapter
import com.example.heroesactivity.models.Character

class HomeActivity : AppCompatActivity() {
    lateinit var username : TextView
    lateinit var logoutbtn : ImageView
    lateinit var dcComics : ImageView
    lateinit var marvelComics :ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        val sharedPreferences = getSharedPreferences("mypref", MODE_PRIVATE)
        username = findViewById(R.id.usernameSH)
        logoutbtn = findViewById(R.id.logoutBtn)
        dcComics= findViewById(R.id.dcComics)
        marvelComics= findViewById(R.id.marvelComics)

        logoutbtn.setOnClickListener {
            val editor = sharedPreferences.edit()
            editor.remove("isLogged")
            editor.apply()

            val intent = Intent(this@HomeActivity,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        dcComics.setOnClickListener {
            val intent = Intent(this@HomeActivity,DCActivity::class.java)
            startActivity(intent)
            finish()
        }

        marvelComics.setOnClickListener {
            val intent = Intent(this@HomeActivity,MarvelActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}