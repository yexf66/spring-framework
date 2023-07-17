package com.maox.bfpptest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAware {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aware_test.xml");
		TestApplicationContextAware bean = applicationContext.getBean(TestApplicationContextAware.class);
		System.out.println(bean.getApplicationContext());
		System.out.println("finish===========================");
	}
}
