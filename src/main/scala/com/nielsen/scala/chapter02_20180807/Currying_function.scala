object Currying_function {
  def plainOldSum(x: Int, y: Int) = x + y //非柯里化函数定义
  def curriedSum(x: Int)(y: Int) = x + y //柯里化使用多个参数列表

  def main(args: Array[String]): Unit = {
//    println(curriedSum(2)(8))
//
    def first(x: Int) = (y: Int) => x + y

    val second = first(2) //柯里化函数调用过程
    val res = second(8)
    println(second)
//
//
//    val onePlus = curriedSum(1) _ //_ 第二个参数列表的占位符，
//    println(onePlus(2)) //传入的是第二个参数
//
//
    def curriedCal(a: Int)(b: Int)(c: Int)(d: Int) = a + b + c + d
    def sum3 = curriedCal(1)(2)(3) _
//    val result = sum3(4)
//    println(result)
//
//    def curriedCal2(a: Int)(b: Int) = (c: Int, d: Int) => a + b + c + d
//    val Cal2 = curriedCal2(1)(2)
//    println(Cal2(3,5))
//
//    def sum2 = curriedCal(1)(2) _
//    println(sum2(3)(6))
//
    def noCurriedCal(a: Int, b: Int, c: Int, d: Int) = a + b + c + d
    def noCurriedSum3 = noCurriedCal(1,2,3,_: Int)

    def noCurriedSum2 = noCurriedCal(1,2,_: Int,_: Int)
//
    println(noCurriedSum2(5,6))

//    def noCurriedMul(a: Int, b: Int, c: Int) = a + b * c
//
//    def noCurriedMul2 = noCurriedMul(1,_: Int,2)
//
//    println(noCurriedMul2(5))
//
    def curriedMul(a: Int)(b: Int)(c: Int) = a + b * c
//
//    def curriedMul2 = curriedMul(1)(2)_
//    println(curriedMul2(5))
//
//    val curriedMul_2 = curriedMul(2)(_: Int)(1)
//    println(curriedMul_2)
//    println(curriedMul_2(5))
//
//    def curriedMul_1 = curriedMul(2) _
//    println(curriedMul_1)



  }
}