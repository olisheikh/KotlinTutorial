package assignmentOne

import java.util.Scanner

/* Question-2:
             Check if a number is even or odd
 */

fun main() {
    val scanner = Scanner(System.`in`)

    // Taking an input number from the user
    print("Enter a number: ")
    val number = scanner.nextInt()

    // checking if the number is even or odd
    if(number % 2 == 0) {
        println("The number is even.")
    } else {
        println("The number is odd.")
    }
}