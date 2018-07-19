package com.nielsen.luffy.classDemo

/**
  * Created by lulu7001 on 2018/7/12.
  */
object Test {

  def main(args:Array[String]): Unit ={
    val fred = new Person;
    fred.age=30;fred.age;
    fred.age=21;
    println(fred.age)

    val student = new Student;
    student.name="luffy";
    println(student.name)
    val student2 = new Student("clark");
    println(student2.name)

     val teacher = new Teacher(name = "Albert","man");
      teacher.name="Albert Sun";
      println(teacher.name)

     

  }

}
