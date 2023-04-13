package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("samsung") //de capitalize and non qualified
public class Samsung {
     
	@Autowired
	@Qualifier("mediaTek")
	MobileProcessor cpu;

	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}
	
	public void config() {
		System.out.println("ram 4gb, 12mp camera,rom 65gb");
		//cpu.process();
	}
}
