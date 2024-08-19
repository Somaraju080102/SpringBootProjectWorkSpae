package com.nani.autowiring.chip;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("echip2")
@Primary
public class Echip2 implements Ichip {
	
	public Echip2() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Echip2 cons");
	}
	
	@Override
	public boolean executeInstuction() {
		// TODO Auto-generated method stub
		
		System.out.println("Overided faile");
		
		return false;
	}

}
