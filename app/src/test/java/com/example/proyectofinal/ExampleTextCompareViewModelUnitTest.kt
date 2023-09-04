package com.example.proyectofinal

import com.example.proyectofinal.model.TextCompareModel
import com.example.proyectofinal.viewmodel.TextCompareViewModel
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleTextCompareViewModelUnitTest {

    private lateinit var viewModel: TextCompareViewModel

    @Before
    fun setUp(){
        viewModel = TextCompareViewModel()
    }

    @Test
    fun areEqualTexts(){
        val textModel = TextCompareModel("hola","hola")
        assertTrue(viewModel.compareTexts(textModel))
    }

    @Test
    fun differentTexts(){
        val textModel = TextCompareModel("hola","adios")
        assertFalse(viewModel.compareTexts(textModel))
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}