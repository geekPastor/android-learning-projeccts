package com.chrinovicmm.compose_state

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.chrinovicmm.compose_state.ui.theme.ComposestateTheme


@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        StatefulCounter()

        val list = remember { getWellnessTasks().toMutableStateList() }
        //WellnessTaskList(list = list) { task -> list.remove(task) }
        WellnessTaskList(list = list, onCloseTask = { task-> list.remove(task) })
    }
}

//fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }

@Preview
@Composable
fun WellnessScreenPreview(){
    ComposestateTheme {
        WellnessScreen()
    }
}