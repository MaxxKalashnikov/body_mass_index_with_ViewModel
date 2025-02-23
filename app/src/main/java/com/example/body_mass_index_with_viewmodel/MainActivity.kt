package com.example.body_mass_index_with_viewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.body_mass_index_with_viewmodel.ui.theme.Body_mass_index_with_ViewModelTheme
import com.example.body_mass_index_with_viewmodel.bmiviewmodel.BmiViewModel
import com.example.body_mass_index_with_viewmodel.ui.components.OutlinedTextFieldBMI

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Body_mass_index_with_ViewModelTheme {
                BodyMassIndex()
            }
        }
    }
}

@Composable
fun BodyMassIndex(bmiViewModel: BmiViewModel = viewModel()) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(top = 24.dp),
    ){
       Text(
           text = "BMI calculator",
           style = MaterialTheme.typography.titleLarge,
           textAlign = TextAlign.Center,
           color = MaterialTheme.colorScheme.primary,
           modifier = Modifier.fillMaxWidth()
       )
        OutlinedTextFieldBMI("height")
        OutlinedTextFieldBMI("weight")
        Text(
            text = "Your BMI is ${bmiViewModel.countBMI}",
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        )
    }

}
