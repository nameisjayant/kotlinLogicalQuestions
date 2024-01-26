package hacker_rank

fun main() {

    val data = compareTriplets(
        a = arrayOf(3, 4, 5),
        b = arrayOf(8, 4, 2)
    )
    data.forEach {
        println(it)
    }
}


fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {

    var alice = 0
    var bob = 0
    val res = arrayOf(0, 0)

    for (i in a.indices) {
        if (a[i] > b[i])
            alice++
        else if (b[i] > a[i])
            bob++
        else { }
    }
    res[0] = alice
    res[1] = bob
    return res
}
