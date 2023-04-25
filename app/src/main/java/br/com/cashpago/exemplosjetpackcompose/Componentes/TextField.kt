package br.com.cashpago.exemplosjetpackcompose.Componentes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun textField(){

    val keyboardController = LocalSoftwareKeyboardController.current
    var password by rememberSaveable { mutableStateOf("") }
    var passwordHidden by rememberSaveable { mutableStateOf(true) }
    val errorMessage = "Text input too long"
    var text by rememberSaveable { mutableStateOf("") }
    var isError by rememberSaveable { mutableStateOf(false) }
    val charLimit = 10

    fun validate(text: String) {
        isError = text.length > charLimit
    }


    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        TextField(
            value = text,
            onValueChange = {text = it},
            label = { Text(text = "Label") },
            singleLine = true
        )
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Label") },
            leadingIcon = { Icon(Icons.Filled.Favorite, contentDescription = "Localized description") },
            trailingIcon = { Icon(Icons.Filled.Info, contentDescription = "Localized description") }
        )
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            value = text,
            onValueChange = {
                text = it
                validate(text)
            },
            singleLine = true,
            label = { Text(if (isError) "Username*" else "Username") },
            supportingText = {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Limit: ${text.length}/$charLimit",
                    textAlign = TextAlign.End,
                )
            },
            isError = isError,
            keyboardActions = KeyboardActions { validate(text) },
            modifier = Modifier.semantics {
                // Provide localized description of the error
                if (isError) error(errorMessage)
            })

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Label") },
            supportingText = {
                Text("Supporting text that is long and perhaps goes onto another line.")
            },
        )
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            value = password,
            onValueChange = { password = it },
            singleLine = true,
            label = { Text("Enter password") },
            visualTransformation =
            if (passwordHidden) PasswordVisualTransformation() else VisualTransformation.None,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            trailingIcon = {
                IconButton(onClick = { passwordHidden = !passwordHidden }) {
                    val visibilityIcon =
                        if (passwordHidden) Icons.Filled.Favorite else Icons.Filled.Info
                    // Please provide localized description for accessibility services
                    val description = if (passwordHidden) "Show password" else "Hide password"
                    Icon(imageVector = visibilityIcon, contentDescription = description)
                }
            }
        )
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Label") },
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(
                onDone = {
                    keyboardController?.hide()
                    // do something here
                }
            )
        )
    }
}