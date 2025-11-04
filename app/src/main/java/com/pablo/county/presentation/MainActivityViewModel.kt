package com.pablo.county.presentation

import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class MainActivityViewModel: ViewModel() {

    private val _counterState = mutableIntStateOf(0)
    val counterState = _counterState


    fun incrementCounter() {
        _counterState.intValue += 1
    }

    fun resetCounter() {
        _counterState.intValue = 0
    }

}