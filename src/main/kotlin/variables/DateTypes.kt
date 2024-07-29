package variables

fun main() {
    // Range of Byte data type(non-decimal number)
    val minByte: Byte = -128
    val maxByte: Byte = 127

    // Range of Short data type(non-decimal number)
    val minShort: Short = -32768
    val maxShort: Short = 32767

    // Range of Integer data type(non-decimal number)
    val minInt: Int = -2_147_483_648
    val maxInt: Int = 2_147_483_647

    // Range of Long data type(non-decimal number)
    val minLong: Long = -9223372036854775807L
    val maxLong: Long = 9223372036854775807L

    // Range of Float data type number(decimal number)
    val minFloat: Float = 3.2f
    val minDouble: Double = 32.2

    // Character type data type
    val ch: Char = 'a'
    val str: String = "abc"

    // Boolean type
    val yes: Boolean = true
    val no: Boolean = false

    // Printing every single output
    println("Byte variable range: $minByte to $maxByte")
    println("Short variable range: $minShort to $maxShort")
    println("Integer variable range: $minInt to $maxInt")
    println("Long variable range: $minLong to $maxLong")
    println("Float variable range: $minFloat")
    println("Double variable range: $minDouble")
    println("Character variable range: $ch")
    println("String variable range: $str")
    println("Boolean(true) variable range: $yes")
    println("Boolean(false) variable range: $no")


}