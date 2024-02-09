package com.chrinovicmm.viewmodel.ui

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.chrinovicmm.viewmodel.data.dataSource

class MainViewModel: ViewModel() {
    val uiState: MutableState<UiState> = mutableStateOf(UiState())

    init {
        onUiEvent(UiEvent.OnInit)
    }

    fun onUiEvent(uiEvent: UiEvent){
        when(uiEvent){
            is UiEvent.OnInit ->{
                uiState.value = UiState(
                    dataSource.randomPerson, 0
                )
            }

            is UiEvent.OnGenerateClick->{
                uiState.value = UiState(
                    dataSource.randomPerson(), uiState.value.clickNumber + 1
                )
            }
        }
    }
}