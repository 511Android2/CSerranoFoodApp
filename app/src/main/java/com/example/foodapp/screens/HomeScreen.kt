package com.example.foodapp.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.foodapp.components.AccountRow
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodapp.components.NewCategoria
import com.example.foodapp.models.listaCategorias
import com.example.foodapp.ui.theme.FoodAppTheme

@Composable
fun HomeScreen(innerPadding:PaddingValues) {
    Column(
        modifier = Modifier.fillMaxSize().padding(innerPadding)
    ) {
        AccountRow()
        Text(
            text = "Nuestras Categorías",
            fontSize = 30.sp
        )
        LazyRow(
            modifier = Modifier.fillMaxWidth().padding(top = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(listaCategorias) {
                NewCategoria(categorias = it)
            }
        }
        Text(
            text = "Nuestros Restaurantes",
            fontSize = 30.sp
        )
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