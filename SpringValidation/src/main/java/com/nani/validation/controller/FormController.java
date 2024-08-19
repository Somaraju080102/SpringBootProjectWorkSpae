package com.nani.validation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nani.validation.entity.FormUser;

@Controller
public class FormController {
	
	
	@GetMapping("/")
	public String LoadLogin(Model model) {
		
		model.addAttribute("formobj",new FormUser());
		
		return "index";
		
	}
	
	@PostMapping("/login")
	public String HandleLogin(FormUser formUser,Model model) {
		
		model.addAttribute("msg","Succesful");
		
		return "login";
		
	}

}
