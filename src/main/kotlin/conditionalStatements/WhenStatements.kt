package conditionalStatements

import java.util.Scanner

fun main() {
    // Declaring an operand
    var num = 20

    when(num) {
        1 -> println("Payment is done")
        2 -> println("Due")
        else -> println("Invalid amount")
    }

    // declaring two operands
    var a = 5
    var b = 3

    val scanner = Scanner(System.`in`)

    val operationType = scanner.nextLine()
    val result: Double

    when(operationType) {
        "add" -> {
            result = a.toDouble() + b
            println("The add is: $result")
        }
        "subtract" -> {
            result = a.toDouble() - b
            println("The subtraction is: $result")
        }
        "multiply" -> {
            result = a.toDouble() * b
            println("The multiplication is: $result")
        }
        "devide" -> {
            result = a.toDouble() / b
            println("The division is: $result")
        }
        "modulus" -> {
            result = a % b.toDouble()
            println("The modulus is: $result")
        }
        else -> {
            println("The result is not available")
        }
    }
}