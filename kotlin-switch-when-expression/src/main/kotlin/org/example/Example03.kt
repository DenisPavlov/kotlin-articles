package org.example

sealed class User

class StandardUser : User() {
    val userName = "user name"
}
class ManagerUser : User() {
    val managerName = "manager name"
}
class AdminUser : User() {
    val adminName = "admin name"
}

fun printAndReturnText(user: User): String =
    when (user) {
        is StandardUser -> {
            println("It was a Standard User.")
            println("Name - ${user.userName}")
            "Standard User"
        }
        is ManagerUser -> {
            println("It was a Manager.")
            println("Name - ${user.managerName}")
            "Manager User"
        }
        is AdminUser -> {
            println("It was an Admin.")
            println("Name - ${user.adminName}")
            "Admin User"
        }
    }

fun main() {
    printAndReturnText(AdminUser())
}