package com.maox.base.componetScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComponentScan {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("componetScan.xml");
		LuoMuWei bean = ac.getBean(LuoMuWei.class);
		System.out.println(bean.getName());

	}
}
