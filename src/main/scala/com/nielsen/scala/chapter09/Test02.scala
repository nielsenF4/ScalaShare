package com.nielsen.scala.chapter09

object Test02 {
  def main(args: Array[String]): Unit = {
    println("test................")

    //    val engine = new V8Engine
    //    engine.start
    //    engine.stop

    val car = new Car
    car.start()
    car.shift()
    car.driving()
    car.turning()
    car.braking()
    car.stop()
  }
}

trait Engine {
  def start(): Unit
  def stop(): Unit
}

class V8Engine extends Engine {
  def start(): Unit = {
    println("V8Engine start....")
  }
  def stop(): Unit = {
    println("V8Engine stop....")
  }
}

trait EngineComponent {
  engine: Engine =>
  val engine: Engine
}

trait Chassis {
  def driving(): Unit
  def turning(): Unit
  def braking(): Unit
}

class PSAChassis extends Chassis {
  def braking(): Unit = {
    println("PSAChassis braking....")
  }
  def driving(): Unit = {
    println("PSAChassis driving....")
  }
  def turning(): Unit = {
    println("PSAChassis turning....")
  }
}

trait ChassisComponent {
  chassis: Chassis =>
  val chassis: Chassis
}

trait Gearbox {
  def shift(): Unit
}

class ZFGearbox extends Gearbox {
  def shift(): Unit = {
    println("ZFGearbox shift....")
  }
}

trait GearboxComponent {
  gearbox: Gearbox =>
  val gearbox: Gearbox
}

class Car extends EngineComponent with Engine with ChassisComponent with Chassis with GearboxComponent with Gearbox {
  val engine = new V8Engine
  val chassis = new PSAChassis
  val gearbox = new ZFGearbox

  def start = engine.start _
  def stop = engine.stop _
  def braking = chassis.braking _
  def driving = chassis.driving _
  def turning = chassis.turning _
  def shift = gearbox.shift _

}






