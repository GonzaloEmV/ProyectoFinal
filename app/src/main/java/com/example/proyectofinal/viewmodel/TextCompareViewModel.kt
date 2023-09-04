package com.example.proyectofinal.viewmodel

import androidx.lifecycle.ViewModel
import com.example.proyectofinal.model.TextCompareModel

class TextCompareViewModel: ViewModel() {

    fun compareTexts(textModel:TextCompareModel): Boolean{
        return textModel.textOne == textModel.textTwo
    }
}