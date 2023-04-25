package br.com.cashpago.exemplosjetpackcompose.Componentes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Tab
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun tab(){

        var state by remember{ mutableStateOf(0) }
        val titles = listOf("Tab 1", "Tab 2", "Tab 3 with lots of text")
        Column {
            TabRow(selectedTabIndex = state) {
                titles.forEachIndexed { index, titulo ->
                    Tab(
                        selected = state == index,
                        onClick = { state = index },
                        text = { Text(text = titulo, maxLines = 2, overflow = TextOverflow.Ellipsis)}
                    )
                }

            }

            Text(
                modifier =  Modifier.align(Alignment.CenterHorizontally),
                text = "Tab seleconado é $state",
                style = MaterialTheme.typography.bodyLarge
            )
        }


}