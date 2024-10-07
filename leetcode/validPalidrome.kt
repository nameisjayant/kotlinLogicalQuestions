package leetcode

import java.util.*

fun main() {
    print(isPalindrome("0P"))
}

fun isPalindrome(s: String): Boolean {
    val nonAlphaString = removeNonAlphaNumeric(s)
    if (s.isEmpty()) return true
    return nonAlphaString == nonAlphaString.reversed()
}

private fun removeNonAlphaNumeric(s: String): String {

    var resultString = ""
    val regex = Regex("[^a-zA-Z0-9]")

    s.forEach {
        if (!regex.matches(it.toString())) {
            resultString += it
        }
    }
    return resultString.lowercase(Locale.getDefault())
}