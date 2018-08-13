package com.nielsen.scala.chapter05_20180813

import java.io.File
import scala.io.Source

object Test2 {
  implicit def file2RichFile(from: File) = new RichFile(from)

  def main(args: Array[String]): Unit = {
    val content = new File("D:/test.txt").read
    println(content)
  }
}

class RichFile(val from: File) {
  def read = Source.fromFile(from.getPath).mkString
}