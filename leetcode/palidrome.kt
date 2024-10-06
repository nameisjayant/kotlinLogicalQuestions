package leetcode

fun main() {
    println(isPalindrome(-121))
}

fun isPalindrome(x: Int): Boolean {

    var temp = x
    var reversed = 0
    if (x >= 0) {
        while (temp != 0) {
            reversed = (reversed * 10) + (temp % 10)
            temp /= 10
        }
    }
    return x == reversed
}
