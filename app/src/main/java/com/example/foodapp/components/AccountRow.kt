package com.example.foodapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodapp.ui.theme.FoodAppTheme
import com.example.foodapp.utils.Account_circle
import com.example.foodapp.utils.Logout

@Composable
fun AccountRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = Account_circle,
            contentDescription = "Icono de la cuenta",
            modifier = Modifier
                .size(50.dp)
                .width(10.dp)
        )
        Spacer(modifier = Modifier.width(2.dp))
        Text(
            text = "Hola, Carlos",
            fontSize = 30.sp
        )
        Icon(
            imageVector = Logout,
            contentDescription = "Icono de salida de cuenta",
            modifier = Modifier
                .padding(start = 105.dp)
                .size(60.dp)
        )
    }
}

@Preview
@Composable
fun AccountRowPreview() {
    FoodAppTheme {
        AccountRow()
    }
}