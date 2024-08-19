package com.nani.autowiring.chip;

import org.springframework.stereotype.Component;

@Component("echip1")
public class Echip1 implements Ichip {
	
	public Echip1() {
		// TODO Auto-generated constructor stub
		System.out.println("Echip1 cons");
	}

	@Override
	public boolean executeInstuction() {
		// TODO Auto-generated method stub
		
		System.out.println("overided chip method");
		return  true;
	}
	
	
	

}
