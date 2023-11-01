package com.chrinovicmm.compose_state

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.chrinovicmm.compose_state.ui.theme.ComposestateTheme


@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier
){
    Column(modifier = modifier) {
        StatefulCounter()
        WellnessTaskList()
    }
}

@Preview
@Composable
fun WellnessScreenPreview(){
    ComposestateTheme {
        WellnessScreen()
    }
}