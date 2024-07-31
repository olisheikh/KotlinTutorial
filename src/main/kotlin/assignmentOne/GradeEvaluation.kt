package assignmentOne

import java.util.Scanner

/* Question-5:
              Grade evaluation- Marks >= 90 Grade A
                                Marks >= 80 Grade B
                                Marks >= 70 Grade C
                                Marks >= 60 Grade D
                                Marks < 60 Grade F
 */
fun main() {
    val scanner = Scanner(System.`in`)

    // taking an input marks from the user
    print("Enter your mark: ")
    val marks = scanner.nextInt()

    // evaluating the grade
    if (marks >= 90) {
        println("Your grade is: A.")
    } else if (marks >= 80) {
        println("Your grade is: B")
    } else if (marks >= 70) {
        println("Your grade is: C")
    } else if (marks >= 60) {
        println("Your grade is: D")
    } else {
        println("Your grade is: F")
    }
}