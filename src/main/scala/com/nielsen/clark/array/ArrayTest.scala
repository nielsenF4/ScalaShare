package com.nielsen.clark.array

import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting

object ArrayTest {

  def main(args: Array[String]): Unit = {
    val a1 = new Array[Int](10)
    a1.head
    a1(0)

    val b = ArrayBuffer[Int]()
    b += 1
    b += 2
    for (i <- 0 until a1.length)
      println(a1(i))

    for (i <- a1)
      println(i)

    val result = for (i <- a1) yield 2 + i

    a1.filter(_ >= 0).map(_ + 2)

    b.foreach(p => println(p))

    b.append(3, 4, 5, 6)
    b.sum

    b.appendAll(Array(3, 4, 5))

    println(b.mkString(" , "))

    b.count(p => p > 1)

    val a = new Array[Int](b.size)
    b.copyToArray(a)
    a

    b.max

    val pairs = Array(("b", 1, 3), ("c", 3, 1), ("a", 5, 2))

    pairs.max((Ordering.by[(String, Int, Int), Int](_._2)))

    val matrix = Array.ofDim[Int](3, 4)

    val c = Array("a", "b", "c")
    c.max

  }
}