package leetcode

fun main() {
  val res=  addTwoNumber(
        l1 = intArrayOf(9,9,9,9,9,9,9),
        l2 = intArrayOf(9,9,9,9)
    )
    println(res.reversed())
}

fun addTwoNumber(
    l1: IntArray,
    l2: IntArray
): MutableList<Char> {
    var sum1 = ""
    var sum2 = ""
    val resultArray:MutableList<Char>  = mutableListOf()
    val reverseArray1 = l1.reversed()
    val reverseArray2 = l2.reversed()

    reverseArray1.forEach {
        sum1 += it
    }

    reverseArray2.forEach {
        sum2 += it
    }
    val result = (sum1.toInt() + sum2.toInt()).toString()
    for (element in result){
        resultArray.add(element)
    }
  return  resultArray
}