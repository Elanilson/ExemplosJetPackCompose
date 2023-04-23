package br.com.cashpago.exemplosjetpackcompose.Componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun card(){
    Scaffold(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)) {paddingValues ->

            Card(
                modifier = Modifier
                    .padding(paddingValues)
                    .size(width = 180.dp, height = 100.dp),
                onClick = {},
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
                Box(modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Yellow)
                    .padding(10.dp)){
                    Text(text = "Oier")
                }
            }

    }
}