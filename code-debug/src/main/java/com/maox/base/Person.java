package com.maox.base;

import javax.annotation.PostConstruct;

public class Person {
	private Integer age;
	private String name;

	@PostConstruct
	public void init() {
		System.out.println("Person#init() is invoked");
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person{" +
				"age=" + age +
				", name='" + name + '\'' +
				'}';
	}
}
