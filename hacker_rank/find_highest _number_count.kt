package hacker_rank


fun main() {
    highestNumberCount(arrayOf(4, 4, 1, 3))
    highestNumber(arrayOf(4, 4, 1, 3))
}

// inbuilt function
private fun highestNumberCount(candles: Array<Int>) {

    val maxValue = candles.max()
    var count = 0

    candles.forEach {
        if (it == maxValue)
            count++
    }
    println(count)
}

// without inbuilt function

private fun highestNumber(candles: Array<Int>) {

    var maxValue = candles[0]
    var count = 0

    // find max value
    candles.forEach {
        if (maxValue < it)
            maxValue = it
    }

    // find counts
    candles.forEach {
        if (it == maxValue)
            count++
    }
    println(maxValue)
}
