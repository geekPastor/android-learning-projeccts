package com.chrinovicmm.state

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.chrinovicmm.state.ui.theme.StateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StateTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyScreen()
                }
            }
        }
    }
}

@SuppressLint("UnrememberedMutableState")
@Composable
fun MyScreen(){
    Column {
        var nombre by remember {
            mutableStateOf(0)
        }
        Button(onClick = { nombre++ }) {
            Text(text = "Clique ${nombre} fois !")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StateTheme {
        MyScreen()
    }
}