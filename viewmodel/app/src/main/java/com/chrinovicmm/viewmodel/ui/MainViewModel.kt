package com.chrinovicmm.viewmodel.ui

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val listPersons = listOf("Chrinovic", "Gloire", "Yves", "John")
    val randomPerson = listPersons.random()
}