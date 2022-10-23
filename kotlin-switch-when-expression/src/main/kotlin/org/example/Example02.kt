package org.example

fun main() {
    println(getUserTypeLabel(UserType.MANAGER))
}

enum class UserType {
    STANDARD, MANAGER, ADMIN
}

fun getUserTypeLabel(userType: UserType): String =
    when (userType) {
        UserType.STANDARD -> "Standard User"
        UserType.MANAGER -> "Manager User"
        UserType.ADMIN -> "Admin User"
    }