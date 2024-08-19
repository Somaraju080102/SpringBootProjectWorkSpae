package com.nani.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nani.login.entity.LoginUser;
import com.nani.login.service.LoginImpl;

@Controller
public class LoginController {
	
	@Autowired
	LoginImpl loginImpl;
	
	@GetMapping("/login")
	public String loginPage(Model model) {
		
		model.addAttribute("uobj",new LoginUser());
		
		
		
		return "index";
	}
	
	@PostMapping("/login")
	public String HandleLogin(LoginUser loginUser, Model model) {
		
		
		LoginUser obj=loginImpl.getUser(loginUser.getEmail(), loginUser.getPassword());
		
		if(obj!=null) {
			model.addAttribute("msg","Login Successful");
		}
		else {
			model.addAttribute("msg","Invalid Credentials");
		}
				
		return "indexsuccess";
		
	}
	
	@GetMapping("/register")
	public String registerPage(Model model) {
		
		model.addAttribute("robj",new LoginUser());
		
		return "registerform";
		
	}
	
	@PostMapping("/register")
	public String HandleRegistartion(LoginUser loginUser, Model model) {
		
		if(loginUser.getUid()==null||loginUser.getEmail()==null||loginUser.getPassword()==null||loginUser.getPhno()==null) {
			
			model.addAttribute("rmsg","Pleas Enter your Credentials");
			
		}
		else {
		if(loginImpl.saveUser(loginUser)==true) {
			model.addAttribute("rmsg","Registration successful");
		}
		else {
			model.addAttribute("rmsg","Registration Unsuccesful");
			
		}
		}
		
		return "registerformsuccess";
		
	
	}
	
	@GetMapping("/password")
	public String getForgetPassword(Model model) {
		
		model.addAttribute("ptext",new LoginUser());
		
		return "password";
		
	}
	
	@PostMapping("/password")
	public String HandleForgetPassword(LoginUser loginUser,Model model) {
		
		String ans=loginImpl.handlePassChange(loginUser);
		
		model.addAttribute("pmsg",ans);
		
		return "preset";
		
		
		
		
	}
	


}
