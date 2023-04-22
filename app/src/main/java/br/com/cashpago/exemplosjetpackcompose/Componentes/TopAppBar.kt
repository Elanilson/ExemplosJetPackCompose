package br.com.cashpago.exemplosjetpackcompose.Componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopAppBar(){
    Scaffold(
        modifier = Modifier.padding(10.dp),
        topBar = { topAppBar()}
    ) { contentPadding ->
        Box(modifier = Modifier.padding(contentPadding)
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            topAppBarSimples()

        }
        Box(
            modifier = Modifier.background(Color.Green)
        ) {

        }

    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun topAppBar(){
    TopAppBar(
        title = {
            Text(text = "TopAppBar Exemplos", modifier = Modifier.padding(start = 10.dp))
        },
        navigationIcon = { Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null )},
        actions = {
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.MoreVert, contentDescription = null)

            }

        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun topAppBarSimples(){
    Scaffold(

        topBar = {
           CenterAlignedTopAppBar(
               colors = TopAppBarDefaults.smallTopAppBarColors(
                   containerColor = Color.DarkGray
               ),
               title = {
                   Text(text = "TopAppBar", modifier = Modifier.padding(start = 10.dp), color = Color.White)
               },
               navigationIcon = {
                   Icon(
                       imageVector = Icons.Default.ArrowBack,
                       tint = Color.White,
                       contentDescription = null,
                       modifier = Modifier.padding(start = 10.dp))
               },
               actions = {
                   IconButton(onClick = {}) {
                       Icon(tint = Color.White,imageVector = Icons.Default.List, contentDescription = null)

                   }

               }
           )

        }

    ) {paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {

        }

    }

}




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun topAppBarSimples1(){
    Scaffold() {paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {

        }

    }
}