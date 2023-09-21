package br.com.erudio.math

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals

@DisplayName("Test Math Operations in SimpleMath Class")
internal class SimpleMathTest02 {
    var math: SimpleMath? = null
    @BeforeEach
    fun beforeEachMethod() {
        math = SimpleMath()
        println("Running @BeforeEach method!")
    }

    @AfterEach
    fun afterEachMethod() {
        println("Running @AfterEach method!")
    }

    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    fun testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo() {
        println("Test 6.2 + 2 = 8.2")

        // AAA Arrange, Act Assert
        // Given / Arrange
        val firstNumber = 6.2
        val secondNumber = 2.0
        val expected = 8.2

        // When / Act
        val actual = math!!.sum(firstNumber, secondNumber)

        // Then / Assert
        Assertions.assertEquals(
            expected, actual
        ) {
            firstNumber.toString() + "+" + secondNumber +
                    " did not produce " + expected + "!"
        }
    }

    @Test
    @DisplayName("Test 6.2 - 2 = 4.2")
    fun testSubtraction() {
        println("Test 6.2 - 2 = 4.2")
        val firstNumber = 6.2
        val secondNumber = 2.0
        val actual = math!!.subtraction(firstNumber, secondNumber)
        val expected = 4.2

        assertEquals(
            expected, actual
        ) {
            firstNumber.toString() + "-" + secondNumber +
                    " did not produce " + expected + "!"
        }
    }

    @Test
    @DisplayName("Test 6.2 * 2 = 12.4")
    fun testMultiplication() {
        println("Test 6.2 * 2 = 12.4")
        val firstNumber = 6.2
        val secondNumber = 2.0
        val actual = math!!.multiplication(firstNumber, secondNumber)
        val expected = 12.4
        assertEquals(
            expected, actual
        ) {
            firstNumber.toString() + "*" + secondNumber +
                    " did not produce " + expected + "!"
        }
    }

    @Test
    @DisplayName("Test 6.2 / 2 = 3.1")
    fun testDivision() {
        println("Test 6.2 / 2 = 3.1")
        val firstNumber = 6.2
        val secondNumber = 2.0
        val actual = math!!.division(firstNumber, secondNumber)
        val expected = 3.1


        assertEquals(3.1, actual, "The testDivision() did not produce expected result!")

        assertEquals(
            expected, actual
        ) {
            "$firstNumber + $secondNumber did not produce $expected!"
        }
    }

    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    //@Disabled("TODO: We need still work on it!")
    @Test
    @DisplayName("Test Division by Zero")
    fun testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException() {

        //given
        val firstNumber = 6.2
        val secondNumber = 0.0
        val expectedMessage = "Impossible to divide by zero!"

        //when & then
        val actual = Assertions.assertThrows(
            ArithmeticException::class.java, {
                //when & then
                math!!.division(firstNumber, secondNumber)
            }) { "Division by zero should throw an ArithmeticException" }
        Assertions.assertEquals(
            expectedMessage, actual.message
        ) { "Unexpected exception message!" }
    }

    @Test
    @DisplayName("Test (6.2 + 2) / 2 = 4.1")
    fun testMean() {
        println("Test (6.2 + 2) / 2 = 4.1")
        val firstNumber = 6.2
        val secondNumber = 2.0
        val actual = math!!.mean(firstNumber, secondNumber)
        val expected = 4.1
        Assertions.assertEquals(
            expected, actual
        ) {
            "(" + firstNumber + "+" + secondNumber + ")/2" +
                    " did not produce " + expected + "!"
        }
    }

    @Test
    @DisplayName("Test Square Root of 81 = 9")
    fun testSquareRoot() {
        println("Test Square Root of 81 = 9")
        val number = 81.0
        val expected = 9.0
        val actual = math!!.squareRoot(number)
        Assertions.assertEquals(
            expected, actual
        ) {
            "Square Root of " + number +
                    " did not produce " + expected + "!"
        }
    }

    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @DisplayName("Display Name")
    @Test
    fun testABCD_When_XYZ_Should() {
        println("Test BDD")
        // Given / Arrange
        // When / Act
        // Then / Assert
    }

    companion object {
        @BeforeAll
        fun setup() {
            println("Running @BeforeAll method!")
        }

        @AfterAll
        fun cleanup() {
            println("Running @AfterAll method!")
        }
    }
}