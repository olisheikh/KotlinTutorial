package assignmentOne

import java.util.Scanner

/* Question-4:
             Check if the year is leap year or not
 */
fun main() {
    val scanner = Scanner(System.`in`)

    // taking an input year from the user
    print("Enter the year: ")
    val year = scanner.nextInt()

    // checking if the year is leap year or not
    if (year % 4 != 0) {
        println("$year, is not a leap year.")
    } else if(year % 100 == 0 && year % 400 != 0) {
        println("$year, is not a leap year.")
    } else if (year % 100 != 0 && year % 400 != 0) {
        println("$year, is a leap year.")
    } else {
        println("$year, is a leap year.")
    }
}