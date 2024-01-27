package hacker_rank


fun main() {

    birthdayBarProblem(arrayOf(1, 2, 1, 3, 2), 3, 2)
}

private fun birthdayBarProblem(
    s: Array<Int>, d: Int, m: Int
) {

    var count = 0
    var sum = 0

    for (i in s.indices) {
      if (m > i){
          for (j in i.until(i + m)) {
              sum += s[j]
              print(" ${s[j]} , ")
          }
          println()
          if (sum == d)
              count++
          sum = 0
      }
    }
    println(count)

}