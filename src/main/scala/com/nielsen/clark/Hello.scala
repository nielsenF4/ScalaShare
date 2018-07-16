package com.nielsen.clark

class Hello {

}
object Hello {
  val f1 = (x: Int, y: Int) => x + y

  val f2 = (x: Int, y: Int) => x * y

  def m1(f: (Int, Int) => Int): Int = {
     f(5, 6)
  }

  def hello(name: String): String = {
    "Hello, " + name
  }

  def main(args: Array[String]): Unit = {
//    println(hello("world!"))

    val r1 = m1(f1)
    println(r1)

    val r2 = m1(f2)
    println(r2)
  }
}