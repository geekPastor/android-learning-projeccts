package com.chrinovicmm.compose_state

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chrinovicmm.compose_state.ui.theme.ComposestateTheme

@SuppressLint("UnrememberedMutableState")
@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        var count by rememberSaveable { mutableStateOf(0) }
        if (count > 0) {
            Text("You've had $count glasses.")
        }
        Button(onClick = { count++ }, Modifier.padding(top = 8.dp), enabled = count < 10) {
            Text("Add one")
        }
    }
}


@Composable
fun StatelessCounter(
    count: Int,
    onIncrement: ()-> Unit,
    modifier: Modifier = Modifier
){
    Column(modifier = modifier.padding(16.dp)) {
        if (count > 0){
            Text(
                text = "You've had $count glasses."
            )
        }
        Button(onClick = onIncrement, Modifier.padding(top = 8.dp), enabled = count < 10 ) {
            Text(text = "Add one")
        }
    }
}

@Composable
fun StatefulCounter(
    modifier: Modifier = Modifier
){
    var count by rememberSaveable {
        mutableStateOf(0)
    }

    StatelessCounter(count, onIncrement = { count++ }, modifier)
}

@Preview
@Composable
fun WaterCounterPreview(){
    ComposestateTheme {
        WaterCounter()
    }
}