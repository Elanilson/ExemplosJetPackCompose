package br.com.cashpago.exemplosjetpackcompose.Componentes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import br.com.cashpago.exemplosjetpackcompose.data.Routes
import br.com.cashpago.exemplosjetpackcompose.data.tela1
import br.com.cashpago.exemplosjetpackcompose.data.tela2
import br.com.cashpago.exemplosjetpackcompose.data.tela3
import br.com.cashpago.exemplosjetpackcompose.data.tela4
import br.com.cashpago.exemplosjetpackcompose.data.tela5

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun navegacao(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.tela1.Route
    ){
        composable(Routes.tela1.Route){ tela1(navController = navController)}
        composable(Routes.tela2.Route){ tela2(navController = navController)}
        composable(Routes.tela3.Route){ tela3(navController = navController)}
        composable(
            Routes.tela4.Route,
            arguments = listOf(navArgument("nome"){
                type = NavType.StringType})){
            navBackStackEntry ->
            tela4(navController = navController,navBackStackEntry.arguments?.getString("nome").orEmpty())
        }
        composable(
            Routes.tela5.Route, arguments = listOf(navArgument("nome"){defaultValue = "Sem nome"})
        ){
            tela5(navController = navController, nome = it.arguments?.getString("nome") )
        }
    }

}