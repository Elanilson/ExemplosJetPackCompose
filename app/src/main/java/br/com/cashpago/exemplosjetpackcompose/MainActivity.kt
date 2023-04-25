package br.com.cashpago.exemplosjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.cashpago.exemplosjetpackcompose.Componentes.MainTopAppBar
import br.com.cashpago.exemplosjetpackcompose.Componentes.alertDialog
import br.com.cashpago.exemplosjetpackcompose.Componentes.badge
import br.com.cashpago.exemplosjetpackcompose.Componentes.badgedBox
import br.com.cashpago.exemplosjetpackcompose.Componentes.bottomAppBar
import br.com.cashpago.exemplosjetpackcompose.Componentes.button
import br.com.cashpago.exemplosjetpackcompose.Componentes.card
import br.com.cashpago.exemplosjetpackcompose.Componentes.checkbox
import br.com.cashpago.exemplosjetpackcompose.Componentes.chip
import br.com.cashpago.exemplosjetpackcompose.Componentes.circularProgressIndicator
import br.com.cashpago.exemplosjetpackcompose.Componentes.drawer
import br.com.cashpago.exemplosjetpackcompose.Componentes.dropdownMenuItem
import br.com.cashpago.exemplosjetpackcompose.Componentes.elevatedAssistChip
import br.com.cashpago.exemplosjetpackcompose.Componentes.menuSuspenso
import br.com.cashpago.exemplosjetpackcompose.Componentes.navegacao
import br.com.cashpago.exemplosjetpackcompose.Componentes.navigationBar
import br.com.cashpago.exemplosjetpackcompose.Componentes.progressBar
import br.com.cashpago.exemplosjetpackcompose.Componentes.surface
import br.com.cashpago.exemplosjetpackcompose.Componentes.switch
import br.com.cashpago.exemplosjetpackcompose.Componentes.tab
import br.com.cashpago.exemplosjetpackcompose.Componentes.textField
import br.com.cashpago.exemplosjetpackcompose.ui.theme.ExemplosJetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExemplosJetPackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                   // MainTopAppBar()
                    //drawer()
                   // navigationBar()
                    ///bottomAppBar()
                    //alertDialog()
                    //chip()
                    //badge()
                    //badgedBox()
                   // button()
                   // card()
                   // checkbox()
                   // progressBar()
                   // circularProgressIndicator()
                  //  menuSuspenso()
                  //  dropdownMenuItem()
                   // elevatedAssistChip()
                    //navegacao()
                    //surface()
                    //switch()
                   // tab()
                    textField()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExemplosJetPackComposeTheme {
        Greeting("Android")
    }
}