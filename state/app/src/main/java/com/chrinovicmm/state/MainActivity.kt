package com.chrinovicmm.state

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
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
    var nombre by rememberSaveable {
        mutableStateOf(0)
    }
    Column {
        Text(text = "Clique ${nombre} fois !")
        IncrementeButton(nombre, {nombre++})
    }
}

@Composable
fun IncrementeButton(nombre: Int, onIncrement: ()->Unit){
    Button(
        onClick = onIncrement,
        colors = if (nombre > 2) ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.Green) else ButtonDefaults.buttonColors()
    ) {
        Text(text = "Clique !")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StateTheme {
        MyScreen()
    }
}