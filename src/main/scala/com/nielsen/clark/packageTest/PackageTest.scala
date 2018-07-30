import java.awt._
package com {
  package nielsen {
    //包可以包含类、对象和特质，但不能包含函数或变量的定义，包对象的出现就是为了解决这个局限。
    //必须跟包对象同名才可以使用包对象里的变量或者函数
    package object people {
      val defalutValue = 90
    }
    package people {
      object PackageTest {
        def percentOf(value: Double, rate: Double) = if (value == 0) defalutValue * rate / 100 else value * rate / 100
      }

      package test {
        import java.util._
        import java.util.{ HashMap => JavaHashMap }
        import java.util.{ ArrayList => _, _ }
        class Employee {
          val salary = 100
          def giveRaise(rate: Double) {
            PackageTest.percentOf(salary, rate)

          }
        }
      }

    }
  }
}

package com.nielse {
  package people1 {
  }
}
