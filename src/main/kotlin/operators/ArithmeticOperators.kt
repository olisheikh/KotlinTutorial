package operators

fun main() {
    // Two operands
    var x = 30
    var y = 20

    // Addition(+) operators
    println("Addition: ${x + y}")

    // Subtraction(-) operators
    println("Subtraction: ${x - y}")

    // Multiplication(*) operators
    println("Multiplication: ${x * y}")

    // Division(/) operators
    println("Division: ${x / y}")

    // We have to convert one operand into float/double to get float/double ans
    println("Division with decimal: ${x.toFloat() / y}")

    // Modulus(%) operators
    println("Modulus: ${x % y}")

}