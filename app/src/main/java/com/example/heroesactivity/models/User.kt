package com.example.heroesactivity.models

data class User(val email : String, val password : String, val name :String){
    companion object{
        val staticUsers = listOf(
            User (email="roge@gmail.com", password="rogelio01", name = "Roger"),
            User (email="samu@gmail.com", password="samuel01", name = "Samu"),
            User (email="diego@gmail.com", password="diego01", name = "Diego"))

    }
}
