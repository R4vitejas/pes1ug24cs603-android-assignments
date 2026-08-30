package com.pes.lib

fun main() {

    val data = "Hi! How are you?"

    // 1. how many vowels in the string

    // 2. how many spaces

    // use of 'when' as a expression

    var vowels = 0;
    var spaces = 0;

    for(ch in data){
        when (ch){
            'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> vowels++

            ' ' -> spaces++
        }
    }
    println("Vowels: $vowels")
    println("Spaces: $spaces")
}