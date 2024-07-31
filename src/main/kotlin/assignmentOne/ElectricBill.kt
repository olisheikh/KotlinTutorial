package assignmentOne

import java.util.Scanner

/* Question-7:
              Calculate electric bill -> 1st 100 unit = 1 Rs. per unit
                                         2nd 100 unit = 1.5 Rs. per unit
                                         3rd 100 or above unit = 2 Rs. per unit
 */

fun main() {
    val scanner = Scanner(System.`in`)

    // taking an input unit from the user
    print("Enter the unit: ")
    val unit = scanner.nextInt()

    // checking per-unit rate
    if (unit <= 100) {
        calculateBill(unit, 1.0)
    } else if(unit > 100 && unit <= 200) {
        calculateBill(unit, 1.5)
    } else {
        calculateBill(unit, 2.0)
    }
}

fun calculateBill(totalUnit: Int, price: Double) {
    val bill = totalUnit * price
    println("Your bill is: $bill Rs.")
}