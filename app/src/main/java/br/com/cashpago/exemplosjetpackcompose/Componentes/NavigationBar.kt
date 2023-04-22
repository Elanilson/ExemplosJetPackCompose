package br.com.cashpago.exemplosjetpackcompose.Componentes

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun navigationBar(){
    var selected by remember{ mutableStateOf(0) }
    val items = listOf("Item 1","Item 2","Item 3")

    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(imageVector = Icons.Default.Favorite, contentDescription = null)},
                selected = ,
                onClick = {  })
            {

            }
        }
    }
}