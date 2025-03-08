package com.example.foodapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.foodapp.components.AccountRow
import androidx.compose.material3.Text
import androidx.compose.ui.unit.sp

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
    }
}