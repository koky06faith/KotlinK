package com.uitprojects.functional

/**
 * https://play.kotlinlang.org/byExample/04_functional/01_Higher-Order%20Functions
 * */

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y

/* ~~~~~-~~~~~-~~~~~-~~~~~-~~~~~-~~~~~-~~~~~-~~~~~-~~~~~-~~~~~ */
//Mime
fun cal(a: Int, b: Int, hey: (Int, Int) -> Int): Int {
    return twoInts(a, b)
}

fun twoInts(a: Int, b: Int) = a * b

/* ~~~~~-~~~~~-~~~~~-~~~~~-~~~~~-~~~~~-~~~~~-~~~~~-~~~~~-~~~~~ */

fun main() {
    val sumResult = calculate(4, 5, ::sum)
    val mulResult = calculate(4, 5) { a, b -> a * b }
    println("sumResult $sumResult, mulResult $mulResult")

    //My own understanding
    val mulR = cal(5, 5, ::twoInts)
    val sumR = cal(5, 5) { a, b -> a - b }
    println("mulR $mulR, sumR $sumR")
}
//Review