package com.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springframework.controllers.MyController;

@SpringBootApplication
public class ManyuSpringDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ManyuSpringDependencyInjectionApplication.class, args);
		
		MyController myController = (MyController) ctx.getBean("myController");
		
		String greetings = myController.sayHello();
		
		System.err.println(greetings);
	}

}
