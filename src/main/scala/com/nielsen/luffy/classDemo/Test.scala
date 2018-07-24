package com.nielsen.luffy.classDemo

/**
	* Created by lulu7001 on 2018/7/12.
	*/
object Test {

	def main(args: Array[String]): Unit = {
		/* val fred = new Person;
		 fred.age=30;fred.age;
		 fred.age=21;
		 println(fred.age)

		 val student = new Student;
		 student.name="luffy";
		 println(student.name)
		 val student2 = new Student("clark");
		 println(student2.name)*/

		//val teacher = new Teacher("Albert", "man", 11);

		//val teacher2   = new Teacher("Clark");
		//      teacher.name="Albert Sun";
		//teacher.test



		val chatter = new Network
		val myFace = new Network
		val a = chatter.join("Fred")
		val b = chatter.join("Wilma")
		a.contacts += b
		val c = myFace.join("Barney")
		//a.contacts+=c

		val aaa = new chatter.Member("111")

		aaa.contacts.foreach(println)

		(chatter.getMembers.map(_.name)).foreach(println)





	}

}
