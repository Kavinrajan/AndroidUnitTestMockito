package com.kavin.androidunittestmockito.calculator

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CalculatorTest {
    /*
    * Operators is mocked to provide dependency for Calculator class
    */
    @Mock
    lateinit var operators: Operators
    lateinit var calculator: Calculator

    @Before
    fun onSetUp() {
        calculator = Calculator(operators)
    }

    @Test
    fun givenValidInput_whenAdd_shouldCallAddOperator() {
        val a = 12
        val b = 8
        calculator.add2Nums(a, b)
        verify(operators).add(a, b)
    }

    @Test
    fun givenValidInput_whenSubtract_shouldCallSubtractOperator() {
        val a = 10
        val b = 20
        calculator.subtract2Nums(a, b)
        verify(operators).subtract(a, b)

    }
    @Test
    fun givenValidInput_whenMultiply_shouldCallMultiplyOperator() {
        val a = 10
        val b = 20
        calculator.multiply2Nums(a, b)
        verify(operators).multiply(a, b)

    }
    @Test
    fun givenValidInput_whenDivide_shouldCallDivideOperator() {
        val a = 10
        val b = 20
        calculator.divide2Nums(a, b)
        verify(operators).divide(a, b)
    }

    @Test
    fun givenValidInput_whenModulus_shouldCallModulusOperator() {
        val a = 10
        val b = 20
        calculator.modulus2Nums(a, b)
        verify(operators).modulus(a, b)
    }
}