package br.com.cashpago.exemplosjetpackcompose.data

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun tela1(navController: NavHostController){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Gray)) {
        Button(
            modifier = Modifier.align(Alignment.Center),
            onClick = { navController.navigate(Routes.tela2.Route) }
        ) {
            Text(text = "Ir tela 2")
        }

    }
}
@Composable
fun tela2(navController: NavHostController){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Yellow), contentAlignment = Alignment.Center) {
        Button(
            modifier = Modifier.align(Alignment.Center),
            onClick = { navController.navigate(Routes.tela3.Route) }
        ) {
            Text(text = "Ir tela 3")
        }
    }
}
@Composable
fun tela3(navController: NavHostController){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Red), contentAlignment = Alignment.Center) {
        Button(
            onClick = { navController.navigate(Routes.tela4.createRoute("Elanilson")) }
        ) {
            Text(text = "Ir tela 4")
        }
    }
}

@Composable
fun tela4(navController: NavHostController, nome : String){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Green), contentAlignment = Alignment.Center) {
        Column(modifier = Modifier) {
            Text(text = "Meu nome é $nome",modifier = Modifier.padding(bottom = 30.dp))
            Button(
                onClick = { navController.navigate(Routes.tela5.createRoute("")) }
            ) {
                Text(text = "Ir tela 5")
            }
        }
    }
}
@Composable
fun tela5(navController: NavHostController, nome : String?){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Magenta), contentAlignment = Alignment.Center) {
        Column(modifier = Modifier) {
            Text(text = "Meu nome é $nome",modifier = Modifier.padding(bottom = 30.dp))
            Button(
                onClick = { navController.navigate(Routes.tela1.Route) }
            ) {
                Text(text = "Ir tela 1")
            }
        }
    }
}