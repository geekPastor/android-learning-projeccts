package com.chrinovicmm.viewmodel.data

object dataSource{
    private val listPersons = listOf("Chrinovic", "Gloire", "Yves", "John")
    val randomPerson = listPersons.random()

    fun randomPerson() = listPersons.random()
}
