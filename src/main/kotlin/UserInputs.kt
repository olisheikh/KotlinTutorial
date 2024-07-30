import java.util.*

fun main() {
    println("Hello world")
    val scanner = Scanner(System.`in`)

    val name = scanner.nextLine()

    println("Your name is: $name")

    val nameWithReadln = readln()
    println("Your name with readln: $nameWithReadln")

    val nameWithReadLine = readLine()
    println("Your name with readLine: $nameWithReadLine")
}