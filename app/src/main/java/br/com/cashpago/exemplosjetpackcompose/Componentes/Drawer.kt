package br.com.cashpago.exemplosjetpackcompose.Componentes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun drawer(){
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val coroutine = rememberCoroutineScope()
    val items = listOf(Icons.Default.Home, Icons.Default.Send, Icons.Default.Email)
    val selectedITem = remember{ mutableStateOf(items[0]) }

    ModalNavigationDrawer(
        drawerState = drawerState,
        gesturesEnabled = false,
        drawerContent = {
            ModalDrawerSheet {
                Spacer(modifier = Modifier.padding(12.dp))
                items.forEach { item ->
                    NavigationDrawerItem(
                        icon = { Icon(imageVector = item, contentDescription = null)},
                        label = { Text(text = item.name.replace("Filled.",""))},
                        selected = item ==  selectedITem.value,
                        onClick = {
                            coroutine.launch { drawerState.close() }
                            selectedITem.value = item
                        },
                        modifier = Modifier.padding(6.dp)
                    )
                }
            }
        }
    ){
        Scaffold(
            topBar = { topAppBarCenter{coroutine.launch { drawerState.open() }}}
        ) {paddingValues ->
            Box(modifier = Modifier.padding(paddingValues))
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun topAppBarCenter(onDrawer:() -> Unit){
    TopAppBar(
        {
            CenterAlignedTopAppBar(
                title = { Text(text = "Center")},
                navigationIcon = { IconButton(onClick = {onDrawer()}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = null )
                }},
                actions = {
                    IconButton(onClick = { }) {
                        Icon(imageVector = Icons.Default.MoreVert, contentDescription = null)
                    }
                }
            )
        }
    )
}