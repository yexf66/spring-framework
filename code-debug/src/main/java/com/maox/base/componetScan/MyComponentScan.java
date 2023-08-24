package com.maox.base.componetScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 此类用来测试ConfigurationClassPostProcessor 解析componentScan
 */
@Configuration
@ComponentScan(basePackages = "com.maox.for_outer_scan")
public class MyComponentScan {

	@Configuration
	@ComponentScan(basePackages = "com.maox.for_inner_scan")
	class InnerClass {

	}
}
