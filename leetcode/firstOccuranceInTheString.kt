package leetcode


fun main() {
    println(
        strStr(
            "sadbutsad", "sad"
        )
    )
}

fun strStr(haystack: String, needle: String): Int {

    if (needle.length > haystack.length) {
        return -1
    }
    var index = 0

    while (index < haystack.length) {
        if (needle.length + index <= haystack.length) {
            if (haystack.substring(index, needle.length + index) == needle)
                return index
        }
        index += 1
    }

    return -1
}