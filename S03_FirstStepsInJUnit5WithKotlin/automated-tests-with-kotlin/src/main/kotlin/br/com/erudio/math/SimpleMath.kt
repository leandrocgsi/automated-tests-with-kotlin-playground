package br.com.erudio.math

import kotlin.math.sqrt

class SimpleMath {
    fun sum(firstNumber: Double, secondNumber: Double): Double {
        return firstNumber + secondNumber
    }

    fun subtraction(firstNumber: Double, secondNumber: Double): Double {
        return firstNumber - secondNumber
    }

    fun multiplication(firstNumber: Double, secondNumber: Double): Double {
        return firstNumber * secondNumber
    }

    fun division(firstNumber: Double, secondNumber: Double): Double {
        if (secondNumber == 0.0) throw ArithmeticException("Impossible to divide by zero!")
        return firstNumber / secondNumber
    }

    fun mean(firstNumber: Double, secondNumber: Double): Double {
        return (firstNumber + secondNumber) / 2
    }

    fun squareRoot(number: Double?): Double {
        return sqrt(number!!)
    }
}
