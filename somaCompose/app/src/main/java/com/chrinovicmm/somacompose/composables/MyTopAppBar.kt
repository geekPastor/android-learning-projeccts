package com.chrinovicmm.somacompose.composables

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBAr(){
    TopAppBar(
        title = {
            Text(
                text = "Soma",
                fontWeight = FontWeight.ExtraBold,
                //modifier = Modifier.align()
            )
    },
    actions = {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.Info,
                    contentDescription ="",
                    //modifier = Modifier.align(Alignment.CenterStart)
                )
            }
        },
    )
}