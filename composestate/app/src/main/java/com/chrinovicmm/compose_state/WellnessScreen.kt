package com.chrinovicmm.compose_state

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.chrinovicmm.compose_state.ui.theme.ComposestateTheme


@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
) {
    Column(modifier = modifier) {
        StatefulCounter()

        WellnessTaskList(
            list = wellnessViewModel.tasks,
            onCheckedTask = { task, checked ->
                wellnessViewModel.changeTaskChecked(task, checked)
            },
            onCloseTask = { task ->
                wellnessViewModel.remove(task)
            }
        )
    }
}

//fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }

@Preview(showBackground = true)
@Composable
fun WellnessScreenPreview(){
    ComposestateTheme {
        WellnessScreen()
    }
}