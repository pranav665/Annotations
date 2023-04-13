package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor {

	@Override
	public void process() {
		System.out.println("world best processor(CPU)");
	}

}
