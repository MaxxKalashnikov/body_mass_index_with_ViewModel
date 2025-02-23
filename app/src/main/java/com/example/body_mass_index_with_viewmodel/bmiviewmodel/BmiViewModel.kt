package com.example.body_mass_index_with_viewmodel.bmiviewmodel

import android.icu.text.DecimalFormat
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlin.math.pow

class BmiViewModel : ViewModel() {
    var heightInput by mutableStateOf("")
    var weightInput by mutableStateOf("")
    val formatter = DecimalFormat("0.0")

    private val height: Float
        get() {
            return heightInput.toFloatOrNull() ?: 0.0f
        }

    private val weight: Float
        get() {
            return weightInput.toFloatOrNull() ?: 0.0f
        }

    val countBMI: Float
        get() {
            return if (height > 0 && weight > 0) {
                formatter.format(weight / height.pow(2)).toFloatOrNull() ?: 0.0f
            } else 0.0f
        }
}