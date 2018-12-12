package com.example.gustavogobetti.simplecalculator

public class Calculator {

    //Available Operations
    public enum class Operations {
        ADD,SUB,DIV,MUL
    }

    //Addition Operation
    fun addNumbers(number1: Double, number2: Double): Int{
        val sum = number1 + number2
        val sumInteger = sum.toInt()
        return sumInteger
    }
    //Subtract operation

    fun subNumbers(number1: Double, number2: Double): Int{
        val sub = number1 - number2
        val subInteger = sub.toInt()
        return subInteger
    }
    // Divide Operation
    fun divNumbers(number1: Double, number2: Double): Int{
        val div = number1 / number2
        val divInteger = div.toInt()
        return divInteger
    }
    // Multiply operation

    fun multNumbers(number1: Double, number2: Double): Int{
        val mult = number1 * number2
        val multInteger = mult.toInt()
        return multInteger
    }

}