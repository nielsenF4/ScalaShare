package com.nielsen.scala.chapter07_20180815


object test extends App {

  def add(x: Int, y: Int, z: Int) = x + y + z

  def addX = add(1, _: Int, _: Int)

//    println(addX(2, 3))


  def addXY = add(1, 1, _: Int)

    //println(addXY(1))


  def curryingAdd(x: Int)(y: Int)(z: Int) = x + y + z

  def curryingAddX = curryingAdd(1)(2) _

//  println(curryingAdd(1)(2)(3))

//  println(curryingAddX(3))


  def mul(x: Int, y: Int) = x * y   //两个参数

  def mulOneAtTime(x: Int) = (y: Int) => x * y    //一个参数

  def curryMul(x: Int)(y: Int) = x * y //mulOneAtTime的简写，柯里化函数

  println(mul(4,7))
  println(mulOneAtTime(4)(7))

  val multiplyOf4 = mul(4,_:Int) //偏应用函数

  println(multiplyOf4(7))
  println(curryMul(4)(7))


}
