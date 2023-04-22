package br.com.cashpago.exemplosjetpackcompose.Componentes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun bottomAppBar(){
    var index by rememberSaveable{ mutableStateOf(0) }
    Scaffold(
        bottomBar = {
            BottomAppBar() {
                NavigationBarItem(
                    icon = { Icon(imageVector = Icons.Default.Favorite, contentDescription = null)},
                    selected = index == 0,
                    onClick = { index = 0 }
                )
                NavigationBarItem(
                    icon = { Icon(imageVector = Icons.Default.Favorite, contentDescription = null)},
                    selected = index == 1,
                    onClick = { index = 1 }
                )

            }
        }
    ) {paddingValues ->
    Box(modifier = Modifier.padding(paddingValues))

    }

}