package com.uitprojects.datastructure

fun main() {
    var numbers = intArrayOf(5, 6, 3, 1, 10)
    numbers.forEach { print("$it  ") }
    println()
    println("~~~~~-~~~~~-~~~~~-~~~~~")
    val arraySorted = BubbleSort().bubbleSort(numbers)
    arraySorted.forEach { print("$it  ") }
}

class BubbleSort {
    fun bubbleSort(array: IntArray): IntArray {
        var swap = true
        while (swap) {
            swap = false
            for (i in 0 until array.size - 1) {
                if (array[i] > array[i + 1]) {
                    val temp = array[i]
                    array[i] = array[i + 1]
                    array[i + 1] = temp

                    swap = true
                }
            }
        }
        return array
    }
}