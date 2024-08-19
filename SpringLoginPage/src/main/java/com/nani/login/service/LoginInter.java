package com.nani.login.service;

import org.springframework.stereotype.Service;

import com.nani.login.entity.LoginUser;

@Service
public interface LoginInter {
	
	
	public boolean saveUser(LoginUser loginUser);
	
	public LoginUser getUser(String email,String pwd);
	
	
	

}
