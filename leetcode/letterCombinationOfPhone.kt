package leetcode

fun letterCombinations(digits: String): List<String> {

    val digitNumberMap =
        mapOf(
            '0' to "",
            '1' to "",
            '2' to "abc",
            '3' to "def",
            '4' to "ghi",
            '5' to "jkl",
            '6' to "mno",
            '7' to "pqrs",
            '8' to "tuv",
            '9' to "wxyz"
        )
    val mappedArray = mutableListOf<String>()

    if (digits.isEmpty() || digits == "1" || digits == "0")
        return emptyList()



    return mappedArray
}


// 23