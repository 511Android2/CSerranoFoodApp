package com.example.foodapp.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.foodapp.components.AccountRow
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodapp.components.NewAlimento
import com.example.foodapp.components.NewCategoria
import com.example.foodapp.components.NewRestaurante
import com.example.foodapp.models.listaAlimentos
import com.example.foodapp.models.listaCategorias
import com.example.foodapp.models.listaRestaurantes
import com.example.foodapp.ui.theme.FoodAppTheme

@Composable
fun HomeScreen(innerPadding:PaddingValues) {
    Column(
        modifier = Modifier.fillMaxSize().padding(innerPadding)
    ) {
        AccountRow()
        Text(
            text = "Nuestras Categorías",
            fontSize = 30.sp,
            color = Color.White
        )
        LazyRow(
            modifier = Modifier.fillMaxWidth().padding(top = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(listaCategorias) {
                NewCategoria(categorias = it)
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Nuestros Restaurantes",
            fontSize = 30.sp,
            color = Color.White
        )
        LazyRow(
            modifier = Modifier.fillMaxWidth().padding(top = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(listaRestaurantes) {
                NewRestaurante(restaurantes = it)
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Nuestras Mejores Comidas",
            fontSize = 30.sp,
            color = Color.White
        )
        LazyVerticalGrid(
            columns = GridCells.Fixed(2)
        ) {
            items(listaAlimentos) {
                NewAlimento(alimentos = it)
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun HomeScreenPreview() {
    FoodAppTheme {
        HomeScreen(innerPadding = PaddingValues(20.dp))
    }
}