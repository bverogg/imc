package com.bverog.imcapp.ui.viewmodels

import android.annotation.SuppressLint
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.bverog.imcapp.R

class BMIViewModel : ViewModel(){

    var weight = mutableStateOf("");
    var height = mutableStateOf("")
    var bmiResult = mutableStateOf("")
    var imageResource = mutableStateOf(R.drawable.ic_launcher_background)

    @SuppressLint("DefaultLocale")
    fun calculateBMI(){
        var weightValue = weight.value.toFloatOrNull()
        val heightValue = height.value.toFloatOrNull()

        if(weightValue != null && heightValue != null && heightValue >0){
            val bmi = weightValue / (heightValue * heightValue)
            bmiResult.value = String.format("%.2f", bmi)

            imageResource.value = when{
                bmi < 18.5 -> R.drawable.underweight
                bmi < 24.9 -> R.drawable.normal_height
                bmi < 29.9 -> R.drawable.overheight
                else -> R.drawable.heavy
            }
        }
    }
}