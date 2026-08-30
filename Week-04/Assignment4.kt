package com.pes.lib

// exception handling
fun getNumber(data: String): Int {
    try {
        return data.toInt()
    } catch (e: NumberFormatException) {
        println("Invalid number")
        return 0
    }
}

fun main() {
    getNumber("12")
    getNumber("a1as")
}