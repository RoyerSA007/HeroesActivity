package com.example.heroesactivity.models

data class Character(val id : Int,val name : String, val img : String,val PublisherId: Int, val type : String){
    companion object{
        val chara = mutableListOf<Character>(
            Character(1, "Iron-Man", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fes.pinterest.com%2Fpin%2F1000713979680414366%2F&psig=AOvVaw0POeglrR69ilmJ8fRjkSE7&ust=1725823995337000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCND4ncTJsYgDFQAAAAAdAAAAABAE", 1, "Hero"),
            Character(2, "Capitan America", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.xtrafondos.com%2Fwallpaper%2Fvertical%2F6324-capitan-america-con-escudo.html&psig=AOvVaw2-Oky1DDnXqwhCeqoq_f5T&ust=1725824175371000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCNDw6JvKsYgDFQAAAAAdAAAAABAJ", 1, "Hero"),
            Character(3, "Thor", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.xtrafondos.com%2Fwallpaper%2Fvertical%2F7655-el-rayo-de-thor.html&psig=AOvVaw302pf5a-ca1ulWcV-x_QyR&ust=1725824224313000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCMigh7LKsYgDFQAAAAAdAAAAABAR", 1, "Hero"),
            Character(4, "Pantera Negra", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pxfuel.com%2Fes%2Fdesktop-wallpaper-htwey&psig=AOvVaw3bhvY312KzZcRM67Ox2z26&ust=1725824317848000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCPjos9_KsYgDFQAAAAAdAAAAABAE", 1, "Hero"),
            Character(5, "Ant-Man", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fes.wallpapers.com%2Fant-man-superheroe&psig=AOvVaw31CgZpKcii16M-wNRVHt6p&ust=1725824358702000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCLCWtfjKsYgDFQAAAAAdAAAAABAJ", 1, "Hero"),
            Character(6, "Venom", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.uhdpaper.com%2F2023%2F09%2Fvenom-marvels-spider-man-2-4k-4691m.html%3Fm%3D0&psig=AOvVaw0KFSA2ulML387YvocF7i5G&ust=1726042723861000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCOjXvK74t4gDFQAAAAAdAAAAABAE", 1, "Anti_hero"),
            Character(7, "Moon Knight", "https://www.google.com/url?sa=i&url=https%3A%2F%2Far.pinterest.com%2Fnleaplaza%2Fmoon-knight%2F&psig=AOvVaw1JL3ypCJ_p8qPneSH4_KRB&ust=1726042660662000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCPi8v4_4t4gDFQAAAAAdAAAAABAJ", 1, "Anti_Hero"),
            Character(8, "Ghost Rider", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fvillanos-del-cine-de-terror.fandom.com%2Fes%2Fwiki%2FGhost_Rider&psig=AOvVaw1_wo0SJpmOEjhwYTmji6Ex&ust=1726042643703000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCJD1mIf4t4gDFQAAAAAdAAAAABAE", 1, "Anti_hero"),
            Character(9, "Punisher", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fmarvel.fandom.com%2Fpl%2Fwiki%2FFrank_Castle_%2528Ziemia-199999%2529&psig=AOvVaw1VgOknjAsRKXB3qQ90-nNb&ust=1726042588292000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCNCiwO73t4gDFQAAAAAdAAAAABAP", 1, "Anti_hero"),
            Character(10, "Deadpool", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.reddit.com%2Fr%2FMarvel%2Fcomments%2F1b992r3%2Fwhat_was_your_introduction_to_deadpool%2F%3Ftl%3Des-es&psig=AOvVaw1csy9V6IeCsWhse6Xf0MTi&ust=1726042528349000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCIDEyNj3t4gDFQAAAAAdAAAAABAE", 1, "Anti_hero"),
            Character(11, "Dr Doom", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fmarvelall.fandom.com%2Fes%2Fwiki%2FDr._Doom&psig=AOvVaw1tSZLPaYEBy9iEg94dBw4e&ust=1726042505731000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCLCBksb3t4gDFQAAAAAdAAAAABAE", 1, "Villian"),
            Character(12, "Galactus", "https://www.google.com/url?sa=i&url=https%3A%2F%2Feitmedia.tech%2F2024%2F05%2F10%2Fmarvel-confirma-a-ralph-ineson-como-galactus-en-los-4-fantasticos%2F&psig=AOvVaw0LJTvCT66gVIa5ZinM_glo&ust=1726042466799000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCMCgnLr3t4gDFQAAAAAdAAAAABAE", 1, "Villian"),
            Character(13, "Ultron", "https://www.google.com/url?sa=i&url=https%3A%2F%2Ftwitter.com%2Fgeekfurioso%2Fstatus%2F965905132000079873&psig=AOvVaw0R9_w4js9Mqb5qcLVeJ4Qp&ust=1726042378491000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCLi9wor3t4gDFQAAAAAdAAAAABAJ", 1, "Vilian"),

            Character(14, "", "", 2, ""),
            Character(15, "", "", 2, ""),
            Character(16, "", "", 2, ""),
            Character(17, "", "", 2, ""),
            Character(18, "", "", 2, ""),
            Character(19, "", "", 2, ""),
            Character(20, "", "", 2, ""),
            Character(21, "", "", 2, ""),
            Character(22, "", "", 2, ""),
            Character(23, "", "", 2, ""),
            Character(24, "", "", 2, ""),
            Character(25, "", "", 2, ""),


        )
    }
}
