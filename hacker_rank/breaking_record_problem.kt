package hacker_rank


fun main() {
    breakingRecords(arrayOf(10, 5, 20, 20, 4, 5, 2, 25, 1))
}

private fun breakingRecords(scores: Array<Int>) {

    var highestRecord = scores[0]
    var lowestScore = scores[0]
    var highestCount = 0
    var lowestCount = 0

    scores.forEach {
        if (it > highestRecord) {
            highestRecord = it
            highestCount++
        } else if (it < lowestScore) {
            lowestScore = it
            lowestCount++
        }
    }

    println(highestCount)
    println(lowestCount)
}