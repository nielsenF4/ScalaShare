package com.nielsen.luffy.classDemo

/**
  * Created by lulu7001 on 2018/7/12.
  */
class Person {

  private var privateAge = 0

  def age={
    print("=========getAge==========")
    privateAge
  }

  def age_=(newValue: Int): Unit ={
    if(newValue>privateAge)
      privateAge = newValue;
    println("-------setAge----------")
  }
}




