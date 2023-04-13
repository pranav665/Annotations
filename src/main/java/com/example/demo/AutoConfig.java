package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class AutoConfig {

	/*
	@Bean
	public Samsung getPhone() {
		return new Samsung();
	}

	@Bean
	public MobileProcessor getProcessor() {
		return new Snapdragon();
	}
	*/

}
