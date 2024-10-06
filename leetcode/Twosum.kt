package leetcode


fun main() {
    val res = twoSums(
        intArrayOf(3, 3), 6
    )
    res.forEach {
        println(it)
    }
}

fun twoSums(
    nums: IntArray,
    target: Int
): IntArray {

    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    return intArrayOf()
}