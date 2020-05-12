package com.uitprojects.datastructure

fun main() {
    var nameOfNumbers = arrayOf("One", "Two", "Three", "Four", "Five")

    for (non in nameOfNumbers) {
        println(non)
    }
    println("~~~~~-~~~~~-~~~~~-~~~~~")
    nameOfNumbers.forEach { non -> println(non) }
    println("~~~~~-~~~~~-~~~~~-~~~~~")
    nameOfNumbers.forEach { it -> println(it) }
    println("~~~~~-~~~~~-~~~~~-~~~~~")
    nameOfNumbers.forEach { println(it) }
    println("~~~~~-~~~~~-~~~~~-~~~~~")

    println("~~~~~-~~~~~-~~~~~-~~~~~")
    nameOfNumbers.forEachIndexed { index, non ->
        println("$index -- $non")
    }

    var map= mapOf(1 to "aaa",1 to "bbb")

    map.forEach { key, value ->
        print("$key - $value")
    }

}

class Person()
