package com.nielsen.hello

class NumJewelsInStones {

}
object numJewelsInStones {
  def main(args: Array[String]): Unit = {
    val J = "aA"
    val S = "aAAbbbb"
    println(numJewelsInStones4(J, S))

  }

  def numJewelsInStones1(J: String, S: String): Int = {
    var jewelsCount = 0
    for (i <- 0 to J.length() - 1) {
      for (j <- 0 to S.length() - 1) {
        if (J(i) == S(j)) {
          jewelsCount += 1
        }
      }
    }
    jewelsCount
  }

  def numJewelsInStones2(J: String, S: String): Int = {
    var jewelsCount = 0
    for (i <- J; j <- S if i == j)
      jewelsCount += 1
    jewelsCount
  }

  def numJewelsInStones3(J: String, S: String): Int = {
    S.count(J.contains(_))
  }

  def numJewelsInStones4(J: String, S: String): Int = {
    S.count(p => J.contains(p))
  }

}