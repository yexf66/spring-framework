package com.maox;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * test.....
 */
public class ZszxzMain {
	public static void main(String[] args) {
		ApplicationContext ac =new AnnotationConfigApplicationContext(SysConfig.class);
		SysUser user = (SysUser) ac.getBean("sysUser");
		System.out.println(user.toString());
	}
}
