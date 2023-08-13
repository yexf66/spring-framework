package com.maox.factoryBean;

import org.springframework.stereotype.Component;

@Component
public class Cat {
	private String name = "maox";

	private Integer age = 3;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
