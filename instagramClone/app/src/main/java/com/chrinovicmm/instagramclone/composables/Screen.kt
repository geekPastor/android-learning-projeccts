package com.chrinovicmm.instagramclone.composables

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Screen(){
    Scaffold (
        topBar = {
            TopBar()
        },
        bottomBar = {
            BottomBar()
        }
    ){
        Column(modifier = Modifier.padding(it)){
            Stories()
            Posts()
        }
    }
}

@Preview
@Composable
fun ScreenPreview(){
    Screen()
}