package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
//spring core annotations
public class LearnAnnotationApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LearnAnnotationApplication.class, args);
		
		//annotation based configuration
	    ApplicationContext factory= new AnnotationConfigApplicationContext(AutoConfig.class);
				
		Samsung s7 = factory.getBean(Samsung.class);
		s7.config();
	} 

}
