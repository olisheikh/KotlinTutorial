fun main() {
    println("Hello World")
    val shortedArray = sortArray(arrayOf(1, 2, 3, 0, -1))

    println(shortedArray.contentToString())
}
fun sortArray(nums: Array<Int>): Array<Int> {
    val sizeOfAr = nums.size

    for (i in 0 until sizeOfAr) {
        for (j in 0 until sizeOfAr) {
            if (nums.get(i) < nums.get(j)) {
                val temp = nums.get(i)
                nums[i] = nums.get(j)
                nums[j] = temp
            }
        }
    }

    return nums
}