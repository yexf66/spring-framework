package com.maox.bfpptest;

import com.maox.A;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBFPP {

	public static void main(String[] args) {

//		MyClassPathXmlApplicationContext applicationContext = new MyClassPathXmlApplicationContext("bfpp_test.xml");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bfpp_test.xml");
		A bean = applicationContext.getBean(A.class);
		System.out.println(bean);
		System.out.println("finish===========================");
	}


}
