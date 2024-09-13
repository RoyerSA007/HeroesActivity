package com.example.heroesactivity.models

data class Character(val id : Int,val name : String, val img : String,val PublisherId: Int, val type : String){
    companion object{
        val chara = mutableListOf<Character>(
            Character(1, "Iron-Man", "https://www.ixpap.com/images/2022/08/Iron-Man-Wallpaper-10.jpg", 1, "Hero"),
            Character(2, "Capitan America", "https://www.xtrafondos.com/wallpapers/vertical/capitan-america-con-escudo-6324.jpg", 1, "Hero"),
            Character(3, "Thor", "https://www.xtrafondos.com/wallpapers/vertical/el-rayo-de-thor-7655.jpg", 1, "Hero"),
            Character(4, "Pantera Negra", "https://e1.pxfuel.com/desktop-wallpaper/58/656/desktop-wallpaper-black-panther-best-mobile-black-panther.jpg", 1, "Hero"),
            Character(5, "Ant-Man", "https://e0.pxfuel.com/wallpapers/383/819/desktop-wallpaper-marvel-antman-metts-ant-film-art-illustration-art-marvel-xr-thumbnail.jpg", 1, "Hero"),
            Character(6, "Venom", "https://e1.pxfuel.com/desktop-wallpaper/455/28/desktop-wallpaper-most-popular-venom-mobile-venom.jpg", 1, "Anti_hero"),
            Character(7, "Moon Knight", "https://e0.pxfuel.com/wallpapers/446/178/desktop-wallpaper-moon-knight-art-marvel.jpg", 1, "Anti_Hero"),
            Character(8, "Ghost Rider", "https://e1.pxfuel.com/desktop-wallpaper/304/257/desktop-wallpaper-ghost-rider-live-group-ghostrider-for-mobiles.jpg", 1, "Anti_hero"),
            Character(9, "Punisher", "https://e1.pxfuel.com/desktop-wallpaper/590/780/desktop-wallpaper-frank-castle-the-punisher-punisher-netflix.jpg", 1, "Anti_hero"),
            Character(10, "Deadpool", "https://e0.pxfuel.com/wallpapers/293/794/desktop-wallpaper-hook-deadpool-deadpool-cartoon-deadpool-art-deadpool-marvel.jpg", 1, "Anti_hero"),
            Character(11, "Dr Doom", "https://e0.pxfuel.com/wallpapers/841/777/desktop-wallpaper-dr-doom-dr-doom.jpg", 1, "Villian"),
            Character(12, "Galactus", "https://e1.pxfuel.com/desktop-wallpaper/613/88/desktop-wallpaper-galactus-comics-hq-galactus-galactus-art.jpg", 1, "Villian"),
            Character(13, "Ultron", "https://e1.pxfuel.com/desktop-wallpaper/762/464/desktop-wallpaper-ultron-for-ultron.jpg", 1, "Vilian"),

            Character(14, "Batman", "https://e0.pxfuel.com/wallpapers/1019/389/desktop-wallpaper-batman-ben-affleck-batman-concept-batman-concept-art-batman-poster.jpg", 2, "Hero"),
            Character(15, "Arrow", "https://e0.pxfuel.com/wallpapers/999/649/desktop-wallpaper-arrow-phone-green-arrow.jpg", 2, "Hero"),
            Character(16, "Cyborg", "https://e1.pxfuel.com/desktop-wallpaper/485/493/desktop-wallpaper-dc-cyborg-dc-extended-universe-cyborg.jpg", 2, "Hero"),
            Character(17, "Martian Manhunter", "https://e1.pxfuel.com/desktop-wallpaper/889/859/desktop-wallpaper-martian-manhunter-vs-ghost-rider-ghost-rider-villains.jpg", 2, "Hero"),
            Character(18, "Mujer Maravilla", "https://e0.pxfuel.com/wallpapers/491/639/desktop-wallpaper-fantastic-wonder-woman-iphone-intended-for-iphone-wonder-1200%C3%971920-wonder-woman-wonder-woman-aesthetic-wonder-woman-artwork-thumbnail.jpg", 2, "Hero"),
            Character(19, "Darkseid", "https://e1.pxfuel.com/desktop-wallpaper/462/991/desktop-wallpaper-darkseid-36-darkseid-q-darkseid.jpg", 2, "Villian"),
            Character(20, "El Guason", "https://e0.pxfuel.com/wallpapers/361/437/desktop-wallpaper-el-guason-joker-half-face.jpg", 2, "Villian"),
            Character(21, "Doomsday", "https://e0.pxfuel.com/wallpapers/853/977/desktop-wallpaper-klaatu-barada-nikto-comics-dc-comics-superman-vs-doomsday.jpg", 2, "Villian"),
            Character(22, "Bane", "https://e0.pxfuel.com/wallpapers/718/780/desktop-wallpaper-bane-background-at-movies-monodomo-bane-phone.jpg", 2, "Villian"),
            Character(23, "Dr Manhattan", "https://e0.pxfuel.com/wallpapers/202/398/desktop-wallpaper-dr-manhattan-minimalist-doctor-manhattan.jpg", 2, "Villian"),
            Character(24, "Catwoman", "https://e1.pxfuel.com/desktop-wallpaper/728/223/desktop-wallpaper-anne-hathaway-catwoman-best-anne-hathway-catwomen-thumbnail.jpg", 2, "Anti-hero"),
            Character(25, "Red Hood", "https://e0.pxfuel.com/wallpapers/273/873/desktop-wallpaper-red-hood-arts-new-mobile-iphone-android-samsung-pixel-xiaomi-red-hood-hood-red-hood-comic-red-hud.jpg", 2, "Anti-hero"),


        )
    }
}

