class Lesson1 {
  def apply(x: String) = println("apply in class " + x)


}
object Lesson1{
  def m1(f:Int => Int):Unit = {
    val r = f(10)
    println(r)
  }

  val f1 = (x: Int) => x*x

  def m2(x: Int): Int = x * 2

  def m3(x: String) = println("123")

  val f2 = (x: Int) => m2(x)

  val f3 = m2 _

  def apply(x: String) = println("apply in object " + x)

  def main(args: Array[String]): Unit = {

//    m1(f1)
//    m1(m2 _)
//    m1(m2)
//    m1(m3)

    Lesson1("no apply")
    Lesson1.apply("with apply")

    val lesson = new Lesson1()
    lesson.apply("with apply")
    lesson("no apply")

  }
}
