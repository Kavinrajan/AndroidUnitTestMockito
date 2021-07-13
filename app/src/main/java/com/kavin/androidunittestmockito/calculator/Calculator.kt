package com.kavin.androidunittestmockito.calculator

class Calculator(private val operator: Operators) {
    fun add2Nums(a: Int, b:Int) : Int = operator.add(a, b)
    fun subtract2Nums(a: Int, b:Int) : Int = operator.subtract(a, b)
    fun multiply2Nums(a: Int, b:Int) : Int = operator.multiply(a, b)
    fun divide2Nums(a: Int, b:Int) : Int = operator.divide(a, b)
    fun modulus2Nums(a: Int, b:Int) : Int = operator.modulus(a, b)
}