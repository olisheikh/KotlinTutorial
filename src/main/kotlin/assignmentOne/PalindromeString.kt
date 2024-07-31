package assignmentOne

import java.util.Scanner

/* Question-9:
                Check if the given string is palindrome or not
 */
fun main() {
    val scanner = Scanner(System.`in`)

    // taking an input string from the user
    print("Enter a string: ")
    val str = scanner.nextLine()

    var newStr = ""

    for (i in str.length - 1 downTo  0) {
        newStr += str[i]
    }

    if (str == newStr) {
        println("$str, is a palindrome.")
    } else {
        println("$str, is not palindrome.")
    }
}