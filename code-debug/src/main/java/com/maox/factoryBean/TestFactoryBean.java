package com.maox.factoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryBean {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factoryBeanApplicationContext.xml");
		Cat cat = applicationContext.getBean(Cat.class);
		System.out.println(cat);
		Student student = (Student) applicationContext.getBean("myFactoryBean");
		System.out.println(student);
		Object myFactoryBean = applicationContext.getBean("&myFactoryBean");
		System.out.println(myFactoryBean);


		System.out.println("finish===========================");
	}
}
