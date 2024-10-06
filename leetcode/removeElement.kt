package leetcode

fun main() {
    println(
        removeElement(
            nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2),
            2
        )
    )
}

fun removeElement(nums: IntArray, `val`: Int): Int {

    var count = 0
    val expectedArray = mutableListOf<Int>()



    nums.forEach {
        if (it != `val`) {
            count += 1
        }
    }
    return count
}