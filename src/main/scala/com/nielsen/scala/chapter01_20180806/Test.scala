package com.nielsen.scala.chapter01_20180806

import scala.collection.immutable.StringOps

object Test extends App {

  //把函数作为实参传递给另外一个函数
  //  def f(name: String) = {
  //    "Hello, " + name
  //  }
  //
  //  def hello(f: (String) => String, name: String) = {
  //    f(name)
  //  }
  //
  //  println(hello(f, "clshen"))

  //把函数作为返回值
  //  def sum(f: Int => Int): (Int, Int) => Int = {
  //    def sumF(a: Int, b: Int): Int = {
  //      if (a > b) 0
  //      else f(a) + sumF(a + 1, b)
  //    }
  //    sumF
  //  }

  //把函数赋值给变量
  //  val hiData = hiBigData _
  //  def hiBigData(name: String) {
  //    println("Hi, " + name)
  //  }
  //  hiData("BigData")

  //把函数存储在数据结构里
  val fArray = Array((x: Int, y: Int) => StringOps, (x: Int, y: Int, z: Int) => Int, (x: Int, y: Int, z: Int) => Unit)
  
  fArray.foreach(p => println(p))
  

}

