package com.example.heroesactivity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.heroesactivity.models.User
import com.example.heroesactivity.ui.HomeActivity

class MainActivity : AppCompatActivity() {

    lateinit var loginBtn : Button
    lateinit var correo : EditText
    lateinit var contraseña : EditText
    lateinit var errorCredentials : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val sharedPreferences = getSharedPreferences("mypref", MODE_PRIVATE)
        val isLogged = sharedPreferences.getBoolean("isLogged", false)
        val intent = Intent(this@MainActivity,HomeActivity::class.java)
        if (isLogged){
            startActivity(intent)
            finish()
        }
//El R. hace referencia a la carpeta de resource
//        val user = User.staticUsers    //No es necesario ponerlo
        loginBtn = findViewById(R.id.loginBtn)
        correo = findViewById(R.id.correo)
        contraseña = findViewById(R.id.contraseña)

        loginBtn.setOnClickListener{
            Log.i("LOGAPP", "Iniciar sesion")

            val email = correo.text.toString()
            val password = contraseña.text.toString()
            errorCredentials = findViewById<TextView>(R.id.errorCredenciales)

            Log.i("EMAIL", email)
            Log.i("PASSWORD", password)
            if (email.isEmpty() || password.isEmpty()){
                Log.i("ERROR","Correo electronico o Contraseña vacio")
                return@setOnClickListener
            }
            val isValidUser = User.staticUsers.any{user->
                user.email == email && user.password == password}
            if(!isValidUser){
                Log.i("ERROR", "El correo o la contraseña no son validos")
                errorCredentials.visibility = View.VISIBLE
                return@setOnClickListener
            }

            errorCredentials.visibility = View.GONE
            val editor = sharedPreferences.edit()
            editor.putBoolean("isLogged", true)
            editor.apply()

            startActivity(intent) //Navegacion de activity a activity
            finish()
        }
    }
}