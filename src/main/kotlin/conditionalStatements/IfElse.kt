package conditionalStatements

fun main() {
    val isRaining = false

    // Simple if-else statement
    if (isRaining) {
        println("Take an umbrella")
    } else {
        println("Don't need to take an umbrella")
    }

    // nested if-if-else block
    val isCarAvailable = false

    if (isRaining) {
        if (!isCarAvailable) {
            println("Take an umbrella")
        } else {
            println("No need to take an umbrella")
        }
    } else {
        println("No need to take an umbrella")
    }

    if (isRaining) {
        println("Take an umbrella")
    } else if (!isRaining) {
        println("Don't take an umbrella")
    } else {
        println("Don't take an umbrella")
    }
}