package hacker_rank

fun main() {
    println(sumOfArray(arrayOf(
        1000000001,
        1000000002,
        1000000003,
        1000000004,
        1000000005
    )))
}

fun sumOfArray(a: Array<Long>): Long {

    var sum: Long = 0

    for (i in a){
        sum += i
    }
    return  sum
}