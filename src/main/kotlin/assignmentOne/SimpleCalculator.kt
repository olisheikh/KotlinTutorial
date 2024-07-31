package assignmentOne

import java.util.Scanner

/* Question-10:
                Create a simple calculator which can perform Addition,
                Subtraction, Multiplication, Division, Modulus.
 */
fun main() {
    val scanner = Scanner(System.`in`)

    // checking does user is giving a valid option or not
    do {
        // Showing users options.
        println(
                    "1.Addition(+).\n" +
                    "2.Subtraction(-).\n" +
                    "3.Multiplication(*).\n" +
                    "4.Division(/).\n" +
                    "5.Modulus(%)."
        )
        print("Select your operation:")

        val option = scanner.nextInt()

        // taking two operand input from the user
        print("Enter the first number: ")
        val firstDigit = scanner.nextInt()

        print("Enter the second number: ")
        val secondDigit = scanner.nextInt()

        when (option) {
            1 -> {
                println("Result of Addition is: ${firstDigit + secondDigit}")
            }

            2 -> {
                println("Result of Subtraction is: ${firstDigit - secondDigit}")
            }

            3 -> {
                println("Result of Multiplication is: ${firstDigit * secondDigit}")
            }

            4 -> {
                println("Result of Division is: ${firstDigit.toDouble() / secondDigit}")
            }

            5 -> {
                println("Result of Modulus is: ${firstDigit % secondDigit}")
            }

            else -> println(".....Please enter a valid option....")
        }
    }while (!(option in 1..5))
}