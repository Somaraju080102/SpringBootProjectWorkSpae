package com.nani.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nani.login.entity.LoginUser;
import com.nani.login.repo.LoginRepo;
import com.nani.login.utility.EmailUtility;

@Service
public class LoginImpl implements LoginInter {
	
	@Autowired
	LoginRepo loginRepo;
	
	@Autowired
	EmailUtility emailUtility;
	
	@Override
	public boolean saveUser(LoginUser loginUser) {
		
		LoginUser loginUser2=loginRepo.save(loginUser);
		
		if(loginUser2.getUid()!=null) {
			String subject="Congratulations";
			String body="Your account is created";
			String to="somaraju.0801@gmail.com";
			
			if(emailUtility.sendEmail(subject, body, to)==true) {
				System.out.println("Mail Sent succesfully");
			}
			
			
			return true;
		}
		return false;
	}

	@Override
	public LoginUser getUser(String email, String pwd) {
		
		LoginUser obj= loginRepo.findByEmailAndPassword(email, pwd);
		
		if(obj!=null) {
			return obj;
		}
		
		return null;
		
	}

	public String  handlePassChange(LoginUser loginUser) {
		
		LoginUser obj=loginRepo.findByEmail(loginUser.getEmail());
		
		if(obj==null) {
			return "User account Dosent exist";
		}
//		System.out.println(obj.getEmail());
//		
//		
		else {
			obj.setPassword(loginUser.getPassword());
			
			loginRepo.save(obj);
			
			
		}
		return "Password Has been successfully reseted";
		
	}

}
