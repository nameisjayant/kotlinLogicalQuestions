package hacker_rank


fun main() {

    findRatio(arrayOf(-4, 3, -9, 0, 4, 1))

}

private fun findRatio(arr: Array<Int>) {
    var positive = 0
    var negation = 0
    var zero = 0

    arr.forEach {
        if (it >= 1)
            positive++
        else if (it == 0)
            zero++
        else
            negation++
    }
    println(String.format("%.6f", (positive.toFloat() / arr.size)))
    println(String.format("%.6f",negation.toFloat() / arr.size))
    println(String.format("%.6f",zero.toFloat() / arr.size))

}