package com.nielsen.Sam.Session1

class ApplyTest {
  def apply() = println("manually class apply")
}
object ApplyTest{
  def apply() = println("manually object apply")

  def main(args: Array[String]): Unit = {
    ApplyTest()
    val x = new ApplyTest()
    x()
  }
}
