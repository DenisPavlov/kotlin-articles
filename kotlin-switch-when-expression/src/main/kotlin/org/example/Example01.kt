package org.example

fun main() {
    val someNumber = 1

    // Simple statement:
    when(someNumber) {
        1 -> "Value is 1"
    }

    // Expression:
    val someText = when(someNumber) {
        1 -> "Value is 1"
        else -> "Value is not 1"
    }
}