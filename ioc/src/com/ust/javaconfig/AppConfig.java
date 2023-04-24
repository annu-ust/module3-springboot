package com.ust.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//should have a bean.the class or method must written a bean
public class AppConfig {
	@Bean(name="helloBean")
	public HelloWorld getBean() {
		return new HelloWorldImp();
	}
}
