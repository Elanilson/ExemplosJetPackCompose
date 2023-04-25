package br.com.cashpago.exemplosjetpackcompose.Componentes

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.text.style.TextAlign

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun surface(){
    var selected by remember{ mutableStateOf(false) }
    Surface(
        selected = selected,
        onClick = {selected = !selected}
    ) {
        Text(text = if (selected) "Selecionado" else "Não selecionado", textAlign = TextAlign.Center)


    }
}