package hacker_rank

import kotlin.math.abs

fun main() {

    val element = arrayOf(arrayOf(11, 2, 4), arrayOf(4, 5, 6), arrayOf(10, 8, -12))

    val res = diagonalDifference(element)
    println(res)
}

private fun diagonalDifference(
    ar: Array<Array<Int>>
): Int {

    var dialog1 = 0
    var dialog2 = 0
    ar.forEachIndexed { index, ints ->
        dialog1 += ints[index]
        dialog2 += ints[(ints.size - 1) - index]
    }
    return abs(dialog1-dialog2)
}