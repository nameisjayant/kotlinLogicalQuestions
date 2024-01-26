package hacker_rank

fun main() {
    minMaxSum(arrayOf(256741038, 623958417, 467905213, 714532089, 938071625))
}

private fun minMaxSum(array: Array<Int>) {

    val resArray = arrayListOf<Long>()
    var sum: Long = 0
    for (i in array.indices) {
        for (j in (array.indices)) {
            if (j != i)
                sum += array[j]
        }
        resArray.add(sum)
        sum = 0
    }

    print("${resArray.min()} ${resArray.max()}")
}