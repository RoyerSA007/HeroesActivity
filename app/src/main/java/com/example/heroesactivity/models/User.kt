package com.example.heroesactivity.models

data class User(val email : String, val password : String){
    companion object{
        val staticUsers = listOf(
            User (email="roge@gmail.com", password="rogelio01"),
            User (email="samu@gmail.com", password="samuel01"),
            User (email="diego@gmail.com", password="diego01"))

    }
}
