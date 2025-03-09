package com.example.foodapp.models

data class Alimentos(
    val id : Int,
    val title : String,
    val image : String,
    val price : String
)

val listaAlimentos = listOf(
    Alimentos(
        id = 1,
        title = "Big Mac",
        image = "https://upload.wikimedia.org/wikipedia/commons/3/30/Big_Mac_hamburger_edit.jpg",
        price = "$97.60"
    ),
    Alimentos(
        id = 2,
        title = "Hamburguesa con Queso",
        image = "https://i0.wp.com/lanoticia.com/wp-content/uploads/2021/09/celebre-el-dia-de-la-hamburguesa-con-queso-pague-0-50-en-mcdonalds.jpg?fit=1200%2C809&ssl=1",
        price = "$78.78"
    ),
    Alimentos(
        id = 3,
        title = "Cuarto deLibra con Queso",
        image = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/McDonald%27s_Quarter_Pounder_with_Cheese%2C_United_States.jpg/1200px-McDonald%27s_Quarter_Pounder_with_Cheese%2C_United_States.jpg",
        price = "$110.46"
    ),
    Alimentos(
        id = 4,
        title = "McNífica",
        image = "https://cdn.milenio.com/uploads/media/2020/09/01/hamburguesa-de-mcdonald-s-instagram.jpg",
        price = "$80.78"
    ),
    Alimentos(
        id = 5,
        title = "McTocino",
        image = "https://www.telemundo.com/sites/nbcutelemundo/files/styles/social_share_1024x768_scale/public/sites/nbcutelemundo/files/images/gallery/2013/09/24/mcdonalds-quarter-pounder-with-cheese001_137607673402.jpg?ramen_itok=iqwQftIcTf",
        price = "$79.67"
    )
)