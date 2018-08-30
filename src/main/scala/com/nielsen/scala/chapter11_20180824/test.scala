package com.nielsen.scala.chapter11_20180824

object test extends App {
  var sign = 1
  val ch: Char = '+'

    ch match {
      case '+' => sign = 1
      case '-' => sign = 1
      case _ => sign = 0
    }
    println(sign)
  //
  //
  //  sign = ch match {
  //    case '+' => 1
  //    case '-' => -1
  //    case _ => 0
  //  }
  //
  //  println(sign)
  //
  //  var digit = 100
  //  val gh: Char = '9'
  //
  //  gh match {
  //    case '+' => digit = 1
  //    case '-' => digit = -1
  //    case _ if Character.isDigit(gh) => digit = Character.digit(gh, 10)
  //    case _ => digit = 0
  //  }
  //  println(digit)
  //
  import scala.math._


    val pi = Pi
    var id = 1.1

    pi match {
      case Pi => id = pi
      case _ => id = -1
    }
  //
    println(id)
  //
  //  val pI = "aaa"
  //  val `#pp` = "aaa"
  //  var id2 = "a"
  //  pI match {
  //    case `#pp` => id2 = "pp"
  //    case "aaa" => id2 = "aaa"
  //    case _ => id2 = "-1"
  //  }
  //
  //  println(id2)
  //
  //
  //  val arr = Array(2,4,3,312)
  //  arr match {
  //    case Array(0) => println(0)
  //    case Array(x, y) => println(x + " " + y)
  //    case Array(1, _*) => println("0  ...")
  //    case _ => println("something else")
  //  }
  //
  //  val list = List(0, 1, 23, 4)
  //  list match {
  //    case 0 :: Nil => println(0)
  //    case x :: y :: Nil => println(x + " " + y)
  //    case 0 :: tail => println("0 ...")
  //    case _ => "something else"
  //  }
  //
  //  println(list)
  //
  //
  //  var pair = (312,0)
  //  pair match {
  //    case (0,_) => println("0...")
  //    case (y, 0) => println(y + "0")
  //    case _ =>println( "neither is o")
  //  }

  def matchTest(x: Any): Any = x match {
    case Person("Alice", 25) => println("Hi Alice!")
    case Person("Bob", 32) => println("Hi Bob!")
    case Person(name, age) =>
      println("Age: " + age + " year, name: " + name + "?")
    case x: Animal => println(x.kind)
    case x: Int => println("Int")
    case x: String => println(x)
    case _: BigInt => println(Int.MaxValue)
    case _ => println("else")
  }

//  val a: String = "Avenger"
//  matchTest(a)
//
  var animal = new Animal("cat")
//  //    case x: Animal => println(x.kind)
  matchTest(animal)
//
  val Bob = new Person("Albert", 32)
  matchTest(Bob)
//
  case class Person(name: String, age: Int)



}
