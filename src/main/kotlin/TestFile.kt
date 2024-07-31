fun main() {
    val s = "A man, a plan, a canal: Panama"
    var left = 0
    var right = s.length-1

    var leftLetter = s[left]
    var rightLetter = s[right]

    while(left < right) {
        if(!leftLetter.isLetter() && !leftLetter.isDigit()){
            leftLetter = s[++left]
            continue
        }
        if(!rightLetter.isLetter() && !rightLetter.isDigit()){
            rightLetter = s[--right]
            continue
        }
        if(leftLetter.toLowerCase()!=rightLetter.toLowerCase()){
            println("Not Palindrome")
        }
        leftLetter = s[++left]
        rightLetter = s[--right]
    }

    println("Palindrome")
}