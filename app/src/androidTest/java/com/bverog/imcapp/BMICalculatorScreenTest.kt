package com.bverog.imcapp

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.bverog.imcapp.ui.screens.BMICalculatorScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class BMICalculatorScreenTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun calculateBMI_showsCorrectResult(){
        composeTestRule.setContent {
            BMICalculatorScreen()
        }
        // Enter Weight and Height
        composeTestRule.onNodeWithText("Weight (kg)").performTextInput("70")
        composeTestRule.onNodeWithText("Height (m)").performTextInput("1.75")

        //click on Button
        composeTestRule.onNodeWithText("Calculate BMI").performClick()

        // Check results
        // que existe un elemento que esté desplegado
        composeTestRule.onNodeWithText("You BMI is 22.86").assertIsDisplayed()


    }
}