package com.nielsen.luffy.classDemo

import scala.collection.mutable.ArrayBuffer

/**
  * Created by lulu7001 on 2018/7/12.
  */
class Network {

  class Member(val name:String){
    val contacts = new ArrayBuffer[Member]
  }

  private  val members = new ArrayBuffer[Member]


  def join(name:String)={
    val m = new Member(name)
    members += m
    m
  }

  def getMembers =members
}
