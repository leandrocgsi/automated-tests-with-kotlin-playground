package br.com.erudio.math

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals

class SimpleMathTest01 {

    @Test
    fun testSum() {
        val math = SimpleMath()
        val result = math.sum(6.2, 2.0)
        Assertions.assertEquals(3.1, result)
    }

    @Test
    fun testDivision() {
        val math = SimpleMath()
        val result = math.division(6.2, 2.0)
        Assertions.assertEquals(3.1, result)
    }
}