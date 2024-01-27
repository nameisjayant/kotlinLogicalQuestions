package hacker_rank


fun main() {
    bonAppetit(
        bill = arrayOf(3, 10, 2, 9),
        1, 7
    )
}

private fun bonAppetit(
    bill: Array<Int>,
    k: Int,
    b: Int
) {
    var total = 0

    for (i in bill.indices) {
        if (i != k)
            total += bill[i]
    }

    if (total / 2 == b)
        println("Bon Appetit")
    else
        print(b - (total / 2))

}
