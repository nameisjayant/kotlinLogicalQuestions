package hacker_rank

fun main() {

    drawStaircase(4)
}

private fun drawStaircase(n: Int) {

    for (i in 1..n) {
        for (j in n.downTo(1)) {
            if (j <= i)
                print("#")
            else
                print(" ")
        }
        println()
    }
}