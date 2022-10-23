package org.example

fun main() {
    val someNumber = 2
    val anotherNumber = 3
    val someText = "hello"

    when {
        someNumber == 1 -> "Value is equal to 1."
        anotherNumber == 55 && someText == "some" -> println("Value is equal to 2.")
        else -> println("Value is greater than 3.")
    }
}