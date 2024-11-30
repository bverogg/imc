package com.bverog.imcapp

import com.bverog.imcapp.ui.viewmodels.BMIViewModel
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class BMIViewModelTest {
    // Inicialización a través de otro método
    private lateinit var bmiViewModel: BMIViewModel

    // antes de todo que instancíe
    @Before
    fun setup(){
        bmiViewModel = BMIViewModel()

    }

    @Test
    fun calculateBMICorrectlyForNormalWeight(){
        // Arrange
        bmiViewModel.weight.value = "70"
        bmiViewModel.height.value = "1.75"

        // Act
        bmiViewModel.calculateBMI()

        // Assert
        assertEquals("22.86", bmiViewModel.bmiResult.value)
        assertEquals(R.drawable.normal_height, bmiViewModel.imageResource.value)

    }

    @Test
    fun calculateBMICorrectlyForUnderweight(){
        // Arrange
        bmiViewModel.weight.value = "49"
        bmiViewModel.height.value = "1.70"

        // Act
        bmiViewModel.calculateBMI()

        // Assert
        assertEquals("16.96", bmiViewModel.bmiResult.value)
        assertEquals(R.drawable.underweight, bmiViewModel.imageResource.value)

    }

    @Test
    fun calculateBMICorrectlyForOverweight() {
     // arreglar
         // Arrange
         bmiViewModel.weight.value = "70"
         bmiViewModel.height.value = "1.60"

         // Act
         bmiViewModel.calculateBMI()

         // Assert
         assertEquals("27.34", bmiViewModel.bmiResult.value)
         //assertEquals("29.75", bmiViewModel.bmiResult.value)
         assertEquals(R.drawable.overheight, bmiViewModel.imageResource.value)

     }

    @Test
    fun calculateBMICorrectlyForHeavyweight() {
        // arreglar
        // Arrange
        bmiViewModel.weight.value = "90"
        bmiViewModel.height.value = "1.70"

        // Act
        bmiViewModel.calculateBMI()

        // Assert
        assertEquals("31.14", bmiViewModel.bmiResult.value)
        //assertEquals("29.75", bmiViewModel.bmiResult.value)
        assertEquals(R.drawable.heavy, bmiViewModel.imageResource.value)

    }


/* calculateBMICorrectlyForUnderweight()
 calculateBMICorrectlyForOverweight()*/




}