package com.nani.mvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringControler {
	
	@GetMapping("/welcome")
	public ModelAndView getMsg() {
	
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("msg","Welcome to Spring MVC");
		mv.setViewName("index");
		
		return mv;
		
	}

}
