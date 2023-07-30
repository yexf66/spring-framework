package com.maox.bfpptest;

import com.maox.base.Cat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationScan {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationApplicationContext.xml");
		Cat cat = applicationContext.getBean(Cat.class);
		System.out.println(cat);

		System.out.println("finish===========================");
	}
}
