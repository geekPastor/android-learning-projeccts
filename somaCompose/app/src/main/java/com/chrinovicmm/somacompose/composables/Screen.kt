package com.chrinovicmm.somacompose.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Screen(){
    Scaffold(
        topBar ={
            MyTopAppBAr()
        },
        bottomBar = {
            MyBottomAppBar()
        }
    ) {
        Column(modifier = Modifier.padding(it)) {
            Profile()
            Analitics()
            Revenue()
            //LastContent()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ScreenPreview(){
    Screen()
}