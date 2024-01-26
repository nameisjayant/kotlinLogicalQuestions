package hacker_rank


fun main() {
    gradingStudent(arrayOf(73, 67, 38, 33))
}

fun gradingStudent(grades: Array<Int>) {

    val resArray = arrayListOf<Int>()

    grades.forEach {
        if (it.lessThan38())
            resArray.add(it)
        else if (it.findMultipleOf5()) {
            val divisible = it / 5
            val compare = ((divisible + 1) * 5) - it
            val roundOff = it + compare
            resArray.add(roundOff)
        } else {
            resArray.add(it)
        }
    }
    println(resArray.map { it })

}

fun Int.findMultipleOf5(): Boolean {
    val divisible = this / 5
    val compare = ((divisible + 1) * 5) - this
    return compare < 3
}

fun Int.lessThan38() = this < 38