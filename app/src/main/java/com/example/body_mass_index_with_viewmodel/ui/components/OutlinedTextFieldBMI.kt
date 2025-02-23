package com.example.body_mass_index_with_viewmodel.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.body_mass_index_with_viewmodel.bmiviewmodel.BmiViewModel

@Composable
fun OutlinedTextFieldBMI(title: String, bmiViewModel: BmiViewModel = viewModel()){
    OutlinedTextField(
        value = if(title == "height") bmiViewModel.heightInput else bmiViewModel.weightInput,
        onValueChange = {if(title == "height") bmiViewModel.heightInput = it else bmiViewModel.weightInput = it},
        label = { Text(title) },
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        modifier = Modifier.fillMaxWidth().padding(8.dp)
    )
}