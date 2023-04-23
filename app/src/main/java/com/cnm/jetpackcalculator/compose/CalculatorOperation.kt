package com.cnm.jetpackcalculator.compose

sealed class CalculatorOperation(val symbol: String) {
    object Add : CalculatorOperation("+")
    object Substract : CalculatorOperation("-")
    object Multiply : CalculatorOperation("*")
    object Devide : CalculatorOperation("/")

}
