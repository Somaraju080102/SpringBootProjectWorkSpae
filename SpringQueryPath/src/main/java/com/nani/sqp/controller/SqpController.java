package com.nani.sqp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nani.sqp.entity.SqpEntity;

@Controller
public class SqpController {
	
	
	@Autowired
	SqpEntity sqpEntity;
	
	
	@GetMapping("/welcome")
	@ResponseBody
	public String HanldeGreetings(@RequestParam("name") String name) {
		
		return  "Hello "+name;
		
		
	}

	@GetMapping("/user/{name}")
	@ResponseBody
	public String HandleWelcome(@PathVariable("name")String name) {
		
		return  "Hello "+name;
		
		
	}

}
