package com.example.heroesactivity.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.heroesactivity.MainActivity
import com.example.heroesactivity.R
import com.example.heroesactivity.models.User
import com.squareup.picasso.Picasso

class HomeActivity : AppCompatActivity() {
    lateinit var username: TextView
    lateinit var logoutbtn: ImageView
    lateinit var dcComics: ImageView
    lateinit var marvelComics: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val backgroundImage: ImageView = findViewById(R.id.background)
        val marvelimg: ImageView = findViewById(R.id.marvelImage)
        val dcimg: ImageView = findViewById(R.id.dcImage)
        val sharedPreferences = getSharedPreferences("mypref", MODE_PRIVATE)
        username = findViewById(R.id.usernameSH)
        logoutbtn = findViewById(R.id.logoutBtn)
        dcComics = findViewById(R.id.dcImage)
        marvelComics = findViewById(R.id.marvelImage)

        // Cargar imágenes con Picasso
        val marvelurl = "https://e1.pxfuel.com/desktop-wallpaper/893/583/desktop-wallpaper-marvel-logo-ultra-marvel-logo.jpg"
        val dcurl = "https://e0.pxfuel.com/wallpapers/901/365/desktop-wallpaper-dc-logo-dc-universe-logo.jpg"
        val background = "https://e1.pxfuel.com/desktop-wallpaper/518/964/desktop-wallpaper-mcu-vs-dceu-cual-universo-ganara-para-mi-marvel-el-mejor-de-todos-mi-vs-dc.jpg"
        Picasso.get()
            .load(background)
            .fit()
            .centerCrop()
            .into(backgroundImage)
        Picasso.get()
            .load(dcurl)
            .fit()
            .centerCrop()
            .into(dcimg)
        Picasso.get()
            .load(marvelurl)
            .fit()
            .centerCrop()
            .into(marvelimg)

        // Manejo del botón de logout
        logoutbtn.setOnClickListener {
            val editor = sharedPreferences.edit()
            editor.remove("isLogged")
            editor.apply()

            val intent = Intent(this@HomeActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Manejo de los clics en las imágenes
        dcComics.setOnClickListener {
            val intent = Intent(this@HomeActivity, DCActivity::class.java)
            startActivity(intent)
            finish()
        }

        marvelComics.setOnClickListener {
            val intent = Intent(this@HomeActivity, MarvelActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
