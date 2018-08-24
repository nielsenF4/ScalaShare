package com.nielsen.scala.chapter09

object Test01 {

  def main(args: Array[String]): Unit = {
    val self = new Self
    println(self foo)

  }

}
class Self {
  self => //self => 这句相当于给this起了一个别名为self
  val tmp = "scala"
  def foo = self.tmp + "	" + this.tmp
}

/*一、 用在有内部类的情况*/
class Outer {
  out =>
  val v1 = "spark"
  class Inner {
    println(out.v1) // 用outer表示外部类，相当于Outer.this

  }
}

/*二、 对子类（或者对象）的约束*/
trait S1

class S2 {
  this: S1 => // 混入trait S1，强制要求 S2的实现类 去实现 S1
}

class S3 extends S2 with S1 //如果没有with S1会报错，表示对于继承S2的class都必须要实现S1

trait S5 { this: S1 => }
class S6 extends S5 with S1  //如果没有with S1会报错，表示对于实现S5的class都必须要实现S1
//任何混入该特质的具体类必须确保它的类型符合特质的自身类型，自身类型最通常的应用是为了把大类分成若干特质。






