package com.chrinovicmm.viewmodel.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun MyScreen(viewModel: MainViewModel = androidx.lifecycle.viewmodel.compose.viewModel()){
    Box(modifier = Modifier.fillMaxSize()){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = viewModel.randomPerson/*text*/,
                fontSize = 25.sp
            )
            
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Genere (deja 0 fois)")
            }
        }
    }
}