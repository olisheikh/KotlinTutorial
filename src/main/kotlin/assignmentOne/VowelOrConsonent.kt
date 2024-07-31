package assignmentOne

import java.util.Scanner

/* Question-6:
             Check for vowel or consonant of a character
 */
fun main() {
    val scanner = Scanner(System.`in`)

    // taking an input character from the user
    print("Enter a character: ")
    val char = scanner.next()[0]

    if (char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u') {
        println("$char, is a vowel.")
    } else {
        println("$char, is a consonant.")
    }
}