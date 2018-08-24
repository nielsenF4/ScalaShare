object Partial_Function {
  def main(args: Array[String]): Unit = {

    def pf: PartialFunction[Int, String] = {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case _ => "other"
    }
//    println(pf(1))
//    println(pf(12))
    /**
      * isDefinedAt function test
      * @return
      */
    def pf1: PartialFunction[Int, String] = {
            case 1 => "one"
            case 2 => "two"
            case 3 => "three"
          }
//    println(pf1(12))
//    println(pf1.isDefinedAt(4))

    /**
      * orElse function test
      * @return
      */
    def pf2: PartialFunction[Int, String] = {
      case _ => "other"
    }

    def pf3 = pf1.orElse(pf2)
//    println(pf3.isDefinedAt(4))
//    println(pf3(1))
//    println(pf3(4))

    /**
      * andThen function test
      * @return
      */
    def pf4: PartialFunction[String, String] = {
      case "one" => "The number is 1"
    }
//    println(pf4(pf3(1)))

    /**
      * applyOrElse function test
      * @return
      */

//    println(pf1.applyOrElse(4,{num: Int => "four"}))

    /**
      *case - guard & other match pattern
      */
    def pf5: PartialFunction[Int, String] = {
      case x if x == 1 => "one"
      case 2 => "two"
      case 3 => "three"
    }
//    println(pf5(1))


    def pf_x: PartialFunction[Any, String] = {
      case x: Int => x + "'s type is Int"
      case x: String => x + "'s type is String"
      case Array(0,_*) => "A array start with 0"
      case _ => "other"
    }
//    println(pf_x(1))
//    println(pf_x("Sam"))
//    println(pf_x(Array(1,2,3)))
//    println(pf_x(Array(0,2,3)))

//    List(1,2,3,"Albert") map {case i:Int=>i+1}

    val listPF = List(1,2,3,"Albert") collect {case i:Int=>i+1}
    listPF.foreach(println)
  }

}
