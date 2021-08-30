package com.phucvh.module;

import com.phucvh.lib.Person;

public class importLib {
	public static void main(String[] args) {
		Person person = new Person();
		person.setFullName("Vu Hoang Phuc");
		person.setAge(20);
		System.out.println("Fullname: "+person.getFullName());
		System.out.println("Age: "+person.getAge());
	}
}
