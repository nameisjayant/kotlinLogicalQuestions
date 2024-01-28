package hacker_rank


fun main() {
    socksMerchant(arrayOf(6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5))
}

private fun socksMerchant(
    ar: Array<Int>
) {
    var count = 0
    for (i in ar.indices) {
        if (i != ar.size - 1)
            if (ar[i] == ar[i + 1])
                count++
    }
    println(count)

}