package br.com.cashpago.exemplosjetpackcompose.Componentes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun navigationBar(){
    var selected by remember{ mutableStateOf(0) }
    val items = listOf("Item 1","Item 2","Item 3")

    Scaffold(
        bottomBar = {
            NavigationBar {
                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        label = { Text(text = item)},
                        icon = { Icon(imageVector = Icons.Default.Favorite, contentDescription = item)},
                        selected = selected == index,
                        onClick = { selected = index }
                    )
                }
            }
        }
    ) {paddingValues ->
        Box(
            modifier = Modifier.padding(paddingValues),
        )
    }


}