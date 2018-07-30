package com {
  package nielse {

  

    package object people {
      val defaultValue = 10
      def f(x: Int, y: Int) = {
        x + y
      }
    }
    
    package people{
      class People{
        def main(args: Array[String]): Unit = {
//          import java.util.{ HashMap => JavaHashMap }
          
          import scala.collection.mutable.HashMap
          import java.util._
//          import java.util.{ HashMap => _, _ }
          val list = new HashMap
          
          
          f(defaultValue, 5)
        }
      }
    }
  }
}