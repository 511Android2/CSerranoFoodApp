package com.example.foodapp.models

data class Categorias (
    val id : Int,
    val title : String,
    val image : String
)

val listaCategorias = listOf(
    Categorias(
        id = 1,
        title = "Fast Food",
        image = "https://static.vecteezy.com/system/resources/previews/000/964/198/non_2x/fast-food-meal-set-vector.jpg"
    ),
    Categorias(
        id = 2,
        title = "Mexicana",
        image = "https://images.immediate.co.uk/production/volatile/sites/30/2022/10/Pork-carnitas-b94893e.jpg?quality=90&resize=556,505"
    ),
    Categorias(
        id = 3,
        title = "China",
        image = "https://media.istockphoto.com/id/483120255/photo/asian-oranage-chicken-with-green-onions.jpg?s=612x612&w=0&k=20&c=0T_g_J5OSnmCei1Slgr1128wzAhzceRvLjd94R3gkgs="
    ),
    Categorias(
        id = 4,
        title = "Italiana",
        image = "https://media.istockphoto.com/id/632439546/photo/pasta-plate.jpg?s=612x612&w=0&k=20&c=zZPaNg_mf7cTVIeJPFVRtsjYClNYkGMcUc5ZBrARwZU="
    ),
    Categorias(
        id = 5,
        title = "Ensaladas",
        image = "https://img.freepik.com/free-photo/salad-from-tomatoes-cucumber-red-onions-lettuce-leaves-healthy-summer-vitamin-menu-vegan-vegetable-food-vegetarian-dinner-table-top-view-flat-lay_2829-6482.jpg"
    )
)