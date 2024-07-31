package assignmentOne

import java.util.Scanner

/* Question-8:
                Check for Voting eligibility 18 or more than 18 years old.
 */

fun main() {
    val scanner = Scanner(System.`in`)

    // taking an input age from the user
    print("Enter you age: ")
    val age = scanner.nextInt()

    // checking if the person is eligible or not
    if (age >= 18) {
        println("Your are eligible for the vote.")
    } else {
        println("Your are not eligible for the vote.")
    }
}