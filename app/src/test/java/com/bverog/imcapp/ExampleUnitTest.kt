package com.bverog.imcapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun addition_isCorrect2() {
       // assertEquals(4, 5)
        // Arrange
        val x = 1
        val y = 2

        //Act
        val result = x + y
        assertEquals(3,result)
    }


}