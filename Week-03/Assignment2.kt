package com.pes.lib

fun convert(names : Array<String?>) {

    // TODO
    // convert the name in array into uppercase -
    // use explicit null check , safe call operator,
    // elvis operator, assertion operator
    for (name in names) {
        if (name != null) {
            println(name.uppercase())
        }
        println(name?.uppercase())

        println(name?.uppercase() ?: "NULL")

        if (name != null) {
            println(name!!.uppercase())
        }
    }
}

fun main() {

    convert(arrayOf("john", null, "merry", "robert"))
}