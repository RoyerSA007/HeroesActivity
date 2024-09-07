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
import com.example.heroesactivity.MainActivity
import com.example.heroesactivity.R

class HomeActivity : AppCompatActivity() {
    lateinit var username : TextView
    lateinit var logoutbtn : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        val sharedPreferences = getSharedPreferences("mypref", MODE_PRIVATE)
        username = findViewById(R.id.usernameSH)
        logoutbtn = findViewById(R.id.logoutBtn)

        logoutbtn.setOnClickListener {
            val editor = sharedPreferences.edit()
            editor.remove("isLogged")
            editor.apply()

            val intent = Intent(this@HomeActivity,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}