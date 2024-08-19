package com.nani.form.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nani.form.user.User;

@Controller
public class UserController {
	
	@GetMapping("/user")
	public ModelAndView loadForm() {
		
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("usrObj",new User());
		mv.setViewName("index");
		
		return mv;
		
		
	}
	
	@PostMapping("/user")
	public ModelAndView HandleSubmitForm(User user) {
		
		System.out.println(user.toString());
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg","User Details Saved");
		
		mv.setViewName("success");
		
		return mv;
		
		
		
	}

}
