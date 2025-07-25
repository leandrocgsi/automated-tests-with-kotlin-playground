package br.com.erudio.math

import kotlin.math.sqrt

class SimpleMath {

    fun sum(numberOne: Double, numberTwo: Double) = numberOne + numberTwo

    fun subtraction(numberOne: Double, numberTwo: Double) = numberOne - numberTwo

    fun multiplication(numberOne: Double, numberTwo: Double) = numberOne * numberTwo

    fun division(numberOne: Double, numberTwo: Double): Double {
        if (numberTwo.equals(0.0)) throw ArithmeticException("Impossible to divide by zero!")
        return numberOne / numberTwo
    }

    fun mean(numberOne: Double, numberTwo: Double) = (numberOne + numberTwo) / 2

    fun squareRoot(number: Double) = sqrt(number)
}