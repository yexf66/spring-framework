package com.maox.bfpptest;

import com.maox.base.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = applicationContext.getBean(Person.class);
		System.out.println(person);

		System.out.println("finish===========================");
	}
}
