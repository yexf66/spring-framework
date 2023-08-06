package com.maox.base.resolveBeforeInstantiation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试通过BeanPostProcessor提前创建Bean
 * AbstractAutowireCapableBeanFactory#createBean(
 * Object bean = resolveBeforeInstantiation(beanName, mbdToUse);
 * )
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("resolveBeforeInstantiation.xml");
		BeforeInstantiation bean = ac.getBean(BeforeInstantiation.class);
		bean.doSomeThing();
	}
}
