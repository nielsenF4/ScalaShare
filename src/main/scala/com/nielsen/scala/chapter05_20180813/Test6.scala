package com.nielsen.scala.chapter05_20180813

import scala.collection.immutable.StringOps

object Test6 {
  def smaller[T](a: T, b: T)(implicit order: T => Ordered[T]) =
    if (order(a) < b) a else b

  def main(args: Array[String]): Unit = {
    println { smaller(20, 10) }
    println { smaller("Hello", "World!") }
  }
}