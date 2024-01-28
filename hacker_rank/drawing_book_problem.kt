package hacker_rank


fun main() {
    drawingBookProblem(7, 4)
}

private fun drawingBookProblem(
    n: Int,
    p: Int
) {

    val start = p - 1
    val end = n - p

    val res = if (n == 0)
        0
    else if (end == 1)
        0
    else if (start <= end) {
        if (start % 2 == 0) {
            start / 2
        } else {
            p / 2
        }
    } else {
        if (end % 2 != 0)
            (end / 2) + 1
        else
            end / 2
    }
    println(res)
}
