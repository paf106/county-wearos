package com.pablo.county.presentation

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MainActivityViewModelTest {

    private lateinit var viewModel: MainActivityViewModel

    @Before
    fun setup() {
        viewModel = MainActivityViewModel()
    }

    @Test
    fun `counter initializes to zero`() {
        assertEquals(0, viewModel.counterState.intValue)
    }

    @Test
    fun `incrementCounter increments the counter correctly`() {
        viewModel.incrementCounter()
        assertEquals(1, viewModel.counterState.intValue)

        viewModel.incrementCounter()
        assertEquals(2, viewModel.counterState.intValue)

        viewModel.incrementCounter()
        assertEquals(3, viewModel.counterState.intValue)
    }

    @Test
    fun `resetCounter resets the counter to zero`() {
        // Increment counter a few times
        viewModel.incrementCounter()
        viewModel.incrementCounter()
        viewModel.incrementCounter()
        
        // Verify counter is not zero
        assertEquals(3, viewModel.counterState.intValue)
        
        // Reset counter
        viewModel.resetCounter()
        
        // Verify counter is now zero
        assertEquals(0, viewModel.counterState.intValue)
    }
}
