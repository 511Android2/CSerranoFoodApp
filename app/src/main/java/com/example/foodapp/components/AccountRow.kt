package com.example.foodapp.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodapp.utils.Account_circle
import com.example.foodapp.utils.Logout

@Composable
fun AccountRow() {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Icon(
            imageVector = Account_circle,
            contentDescription = "Icono de la cuenta",
            modifier = Modifier.width(10.dp)
        )
        Text(
            text = "Hola, Carlos",
            fontSize = 30.sp
        )
        Icon(
            imageVector = Logout,
            contentDescription = "Icono de salida de cuenta",
            modifier = Modifier.width(10.dp)
        )
    }
}