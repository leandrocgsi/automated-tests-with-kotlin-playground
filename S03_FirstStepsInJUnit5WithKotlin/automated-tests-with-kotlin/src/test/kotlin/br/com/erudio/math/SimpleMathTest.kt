package br.com.erudio.math

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class SimpleMathTest {

    @Test
    fun testDivision() {
        val math = SimpleMath()
        val result = math.division(6.2, 2.0)
        Assertions.assertEquals(3.1, result, "The testDivision() did not produce expected result!")
    }
}

