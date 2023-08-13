package com.maox.factoryBean;

import org.springframework.beans.factory.FactoryBean;

/**
 * factoryBean 最终也会交由spring容器来管理，在真正getBean时候才会调用getObject来创建对象
 * 如果isSingleton返回true 会让在缓存中，下次获取直接从缓存中取，如果返回false则每次getBean都会创建新的对象
 */
public class MyFactoryBean implements FactoryBean<Student> {

	@Override
	public Student getObject() throws Exception {
		Student student = new Student();
		student.setName("kyn");
		student.setAge(12);
		student.setGrade(3);
		return student;
	}


	@Override
	public Class<?> getObjectType() {
		return Student.class;
	}
}
