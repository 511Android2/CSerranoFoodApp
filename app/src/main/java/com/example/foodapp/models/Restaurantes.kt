package com.example.foodapp.models

data class Restaurantes (
    val id : Int,
    val title : String,
    val image : String
)

val listaRestaurantes = listOf(
    Restaurantes(
        id = 1,
        title = "McDonalds",
        image ="https://static.vecteezy.com/system/resources/previews/013/948/540/non_2x/mcdonald-s-logo-on-transparent-white-background-free-vector.jpg"
    ),
    Restaurantes(
        id = 2,
        title = "Burger King",
        image ="https://e7.pngegg.com/pngimages/553/810/png-clipart-burger-king-new-logo-icons-logos-emojis-iconic-brands.png"
    ),
    Restaurantes(
        id = 3,
        title = "KFC",
        image ="https://w7.pngwing.com/pngs/115/811/png-transparent-kfc-logo-fast-food-restaurant-mcdonald-s-fried-chicken-miscellaneous-fast-food-restaurant-logo.png"
    ),
    Restaurantes(
        id = 4,
        title = "Subway",
        image ="https://i.pinimg.com/736x/4b/eb/2a/4beb2a37a5810f9eacc37e3c6234889c.jpg"
    ),
    Restaurantes(
        id = 5,
        title = "Carl's jr.",
        image ="https://i0.wp.com/www.frogx3.com/wp-content/uploads/2017/04/carls_jr_logo.png?fit=1000%2C450&ssl=1&resize=1280%2C720"
    )
)