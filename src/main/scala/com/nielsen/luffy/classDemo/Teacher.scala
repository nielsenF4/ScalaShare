package com.nielsen.luffy.classDemo

/**
	* Created by lulu7001 on 2018/7/12.
	*/

class Teacher(name: String, sex: String) {

	println(111)
	var age: Int = 0


	def this(name: String, sex: String, age: Int) {
		this(name, sex)
		this.age = age
	}


	def test: Unit = {
		println(this.name)
		println(this.sex)
	}

}
