package com.example.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	
public UserDao() {
	
	System.out.println("User Dao");
}

public String getName(int id) {
	if(id==100) {
		return "Call Police";
	}
	else if(id==108) {
		return "Call Ambulance";
	}
	
	return "Please enter proper Servie numebr";
}
}
