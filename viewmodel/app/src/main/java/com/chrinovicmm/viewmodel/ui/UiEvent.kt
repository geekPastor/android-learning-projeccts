package com.chrinovicmm.viewmodel.ui

sealed class UiEvent {
    object OnInit: UiEvent()
    object OnGenerateClick: UiEvent()
}