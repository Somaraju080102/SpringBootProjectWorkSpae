package com.nani.autowiring.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nani.autowiring.chip.Ichip;

@Component
public class Robot {
	
	@Autowired
	@Qualifier("echip1")
	private Ichip iChip;
	
	
	public void runChip() {
		
		boolean ans=iChip.executeInstuction();
		
		if(ans==true) {
			System.out.println("Robot is will work fine");
		}
		else {
			System.out.println("Robot has been failed");
		}
		
	}
	

}
