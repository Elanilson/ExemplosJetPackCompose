package br.com.cashpago.exemplosjetpackcompose.Componentes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun checkbox(){
    var checkStatus by remember{ mutableStateOf(true) }
    var (checkedState, onStateChange) = remember { mutableStateOf(true) }
    Scaffold() {paddingValues ->

    Box(modifier = Modifier
        .padding(paddingValues)
        .fillMaxSize(), contentAlignment = Alignment.Center) {
        Checkbox(
            modifier = Modifier.padding(bottom = 60.dp),
            checked = checkStatus ,
            onCheckedChange = { checkStatus = !checkStatus}
        )

        Row(modifier =
        Modifier
            .fillMaxWidth()
            .height(56.dp)
            .toggleable(
                value = checkStatus,
                onValueChange = {onStateChange( !checkedState)},
                role = Role.Checkbox
            )
            .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = checkedState ,
                onCheckedChange = null
            )
            Text(
                text = "Option selection",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 16.dp)
            )

        }
    }

    }
}