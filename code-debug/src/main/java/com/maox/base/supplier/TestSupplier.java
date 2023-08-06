package com.maox.base.supplier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * supplier 方式创建bean对象
 */
public class TestSupplier {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("supplier.xml");
		User bean = ac.getBean(User.class);
		System.out.println(bean.getUsername());
	}
}
