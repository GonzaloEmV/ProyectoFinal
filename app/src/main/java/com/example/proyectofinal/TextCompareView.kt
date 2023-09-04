package com.example.proyectofinal

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectofinal.databinding.ActivityMainBinding
import com.example.proyectofinal.model.TextCompareModel
import com.example.proyectofinal.viewmodel.TextCompareViewModel

class TextCompareView : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private val viewModel: TextCompareViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnCompare.setOnClickListener{
            val textOne = binding.editTextOne.text.toString()
            val texTwo = binding.editTextTwo.text.toString()

            val textModel = TextCompareModel(textOne,texTwo)
            val areEqual = viewModel.compareTexts(textModel)

            val resultMessage = if (areEqual) "LOS TEXTOS SON IGUALES" else "LOS TEXTOS NO SON IGUALES"
            binding.result.text = resultMessage
        }
    }
}