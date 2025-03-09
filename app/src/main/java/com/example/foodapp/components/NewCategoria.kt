package com.example.foodapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodapp.models.Categorias
import com.example.foodapp.models.listaCategorias
import com.example.foodapp.ui.theme.FoodAppTheme

@Composable
fun NewCategoria(categorias: Categorias) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(24.dp))
            .background(Color.White)
            .width(300.dp)
            .height(200.dp)
            .padding(16.dp)
    ) {
        Text(
            text = categorias.title,
            modifier = Modifier.align(Alignment.Center),
            color = Color.White,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable
fun NewCategoriaPreview () {
    FoodAppTheme {
        NewCategoria(categorias = listaCategorias[0])
    }
}