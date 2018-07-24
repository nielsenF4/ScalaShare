package com.nielsen.luffy.classDemo

/**
	* Created by lulu7001 on 2018/7/20.
	*/
class Human {

	private var name = ""
	private var age = 0

	def this(name: String) {
		this()
		this.name = name
	}

	def this(name: String, age: Int) {
		this(name)
		this.age = age
	}


}
