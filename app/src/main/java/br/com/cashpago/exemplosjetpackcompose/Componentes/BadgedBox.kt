package br.com.cashpago.exemplosjetpackcompose.Componentes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun badgedBox(){
    Scaffold(
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    icon = {
                           BadgedBox(
                               badge = {
                                   Badge{
                                       val badgeNumero = "8"
                                       Text(text = badgeNumero, modifier = Modifier.semantics { contentDescription = "conteudo" })
                                   }
                               }
                           ) {
                               Icon(imageVector = Icons.Default.Favorite, contentDescription = null)
                           }
                    },
                    selected = false ,
                    onClick = {  }
                ) 
            }
        }
    ) {paddingValues ->  
        Box(modifier = Modifier
            .padding(paddingValues),
        contentAlignment = Alignment.Center) {

            
        }
    }
}