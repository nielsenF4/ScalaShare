package com.nielsen.scala.chapter09

object Test02 {
  def main(args: Array[String]): Unit = {
       println("test................")
    val engine = new V8Engine
    val chassis = new PSAChassis
    val gearbox = new ZFGearbox
    val car = new Car(engine, chassis, gearbox)
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

class Car(val engine: Engine, val chassis: Chassis, val gearbox: Gearbox) extends EngineComponent with Engine with ChassisComponent with Chassis with GearboxComponent with Gearbox {
  def start = engine.start
  def stop = engine.stop
  def braking = chassis.braking
  def driving = chassis.driving
  def turning = chassis.turning
  def shift = gearbox.shift
}






