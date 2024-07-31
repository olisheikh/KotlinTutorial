package assignmentOne

import java.util.Scanner

/* Question-1:
              Check if a number is positive or negative or zero.
 */

fun main() {
    val scanner = Scanner(System.`in`)

    // Taking an input number from the user
    print("Enter a number: ")
    val num = scanner.nextInt()

    // Checking if the number is positive, negative, or zero.
    if (num > 0) {
        println("The number is positive.")
    } else if (num < 0) {
        println("The number is negative.")
    } else {
        println("The number is zero.")
    }
}