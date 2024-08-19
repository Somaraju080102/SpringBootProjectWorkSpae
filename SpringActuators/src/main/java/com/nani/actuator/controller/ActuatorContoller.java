package com.nani.actuator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ActuatorContoller {
	
	
	@GetMapping("/")
	@ResponseBody
	public String GreetMessage() {
		
		return "Hello Somaraju";
	}

}
