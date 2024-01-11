package com.chrinovicmm.somacompose.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyBottomAppBar(){
    BottomAppBar {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ){
            BottonMenuItem(icon = Icons.Default.Home, titre = "Dashboard")
            BottonMenuItem(icon = Icons.Default.List, titre = "Contenu")
            BottonMenuItem(icon = Icons.Default.CheckCircle, titre = "Analitics")
            BottonMenuItem(icon = Icons.Default.Email, titre = "Email")

        }
    }
}


@Composable
fun BottonMenuItem(icon: ImageVector, titre: String){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.size(width = 60.dp, height = 40.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = ""
        )
        Text(
            text = titre,
            overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.titleSmall
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MyBottomAppBarPreview(){
    MyBottomAppBar()
}