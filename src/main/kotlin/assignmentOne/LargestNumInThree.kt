package assignmentOne

import java.util.Scanner

/* Question-3:
             Find the largest number among three numbers.
 */

fun main() {
    val scanner = Scanner(System.`in`)

    // taking three input numbers from the user
    print("Enter the first number: ")
    val firstNumber = scanner.nextInt()

    print("Enter the second number: ")
    val secondNumber = scanner.nextInt()

    print("Enter the third number: ")
    val thirdNumber = scanner.nextInt()

    if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
        println("The $firstNumber is the largest number.")
    } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
        println("The $secondNumber is the largest number.")
    } else {
        println("The $thirdNumber is the largest number.")
    }
}