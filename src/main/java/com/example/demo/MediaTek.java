package com.example.demo;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary   //take first in case of conflict 
public class MediaTek implements MobileProcessor{

	@Override
	public void process() {
		System.out.println("2nd best processor");
	}

}
