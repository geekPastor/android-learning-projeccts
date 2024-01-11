package com.chrinovicmm.compose_state

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier

//private fun getWellnessTasks() = List(30){ i->WellnessTask(i, "Task # $i") }

@Composable
fun WellnessTaskList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask> = rememberSaveable { getWellnessTasks() },
    onCloseTask: (WellnessTask) -> Unit,
    onCheckedTask: (WellnessTask, Boolean)-> Unit
){
    LazyColumn(
        modifier = modifier
    ){
        items(
            items = list,
            key = { task-> task.id }
        ){task->
            //WellnessTaskItem(taskName = task.label, onCloseTask = { onCloseTask })
            WellnessTaskItem(
                taskName = task.label,
                onClose = { onCloseTask(task) },
                onCheckedChange = { checked-> onCheckedTask(task, checked) },
                checked = task.checked
            )
        }
    }
}