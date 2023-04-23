package br.com.cashpago.exemplosjetpackcompose.Componentes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun alertDialog(){
    var show by remember{ mutableStateOf(false) }
    Scaffold() {paddingValues ->
        Column(modifier = Modifier.padding(paddingValues).fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ){
            Button(
                onClick = { show = !show  }
            ) {
                Text(text = "AlertDialog")
            }
        }
        alertD(
            show = show,
            onConfirm = {show = true},
            onDismiss = {show = false}
        )



    }

}

@Composable
fun alertD(show :Boolean, onConfirm:() -> Unit, onDismiss:() -> Unit){

    if(show){
        AlertDialog(
            icon = { Icon(imageVector = Icons.Default.Info, contentDescription = null)},
            title = { Text(text = "Mensagem")},
            text = { Text(text = "This area typically contains the supportive text " +
                    "which presents the details regarding the Dialog's purpose.")},
            onDismissRequest = { false},
            dismissButton = {
                TextButton(onClick = { onDismiss() }) {
                    Text("Confirm")
                }
            },
            confirmButton = {
                TextButton(
                    onClick = {  onConfirm() }) {
                    Text("Confirm")
                }
            },
        )

    }

}