package com.chrinovicmm.instagramclone.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.sharp.PlayArrow
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BottomBar(){
    BottomAppBar {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            BottomBarItem(icon = Icons.Filled.Home)
            BottomBarItem(icon = Icons.Filled.Search)
            BottomBarItem(icon = Icons.Filled.AddCircle)
            BottomBarItem(icon = Icons.Sharp.PlayArrow)
            BottomBarItem(icon = Icons.Default.AccountCircle)
        }
    }
}

@Composable
fun BottomBarItem(icon: ImageVector){
    Icon(
        imageVector = icon,
        contentDescription = "",
        modifier = Modifier.size(width = 60.dp, height = 40.dp)
    )
}

@Preview
@Composable
fun BottomBarPreview(){
    BottomBar()
}