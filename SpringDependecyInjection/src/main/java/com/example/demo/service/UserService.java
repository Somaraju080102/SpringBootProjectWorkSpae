package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDao;

@Service
public class UserService {
	
	
	
	public UserService() {
		System.out.println("Serivce User");
	}
	
	UserDao userDao;
	
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public UserDao getUserDao() {
		return userDao;
	}
	
	public void findService(int val) {
		
		String ans=userDao.getName(100);
		
		System.out.println(ans);
		
		
	}

}
