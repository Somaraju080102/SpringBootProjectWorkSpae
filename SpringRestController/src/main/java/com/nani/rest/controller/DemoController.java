package com.nani.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nani.rest.entity.StudentInfo;

@RestController
public class DemoController {
	
	@Autowired
	StudentInfo studentInfo;
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> getResponse(@PathVariable("id") Integer id){
		 
		
		return new ResponseEntity<>("Deleted ",HttpStatus.OK);
	}	
	@GetMapping("/response")
	public ResponseEntity<String> getResponse(){
		
		return new ResponseEntity<>("Hello",HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/welcome")
	public ResponseEntity<String> getMsg(@RequestBody StudentInfo s){
		
		System.out.println("Post method called" +" "+s.toString());
		
		return new ResponseEntity<>("Saved Stduent Info",HttpStatus.CREATED);
		
	}
	@GetMapping( value="/welcome")
	public StudentInfo getMessage() {
		studentInfo.setAge(22);
		studentInfo.setId(1);
		studentInfo.setName("Somaraju");
		System.out.println("Called");
		return studentInfo;
		
	}
	
	@GetMapping("/greet/{name}")
	public String greetName(@PathVariable("name") String name) {
		
		return "Hello"+" "+name;
		
	}

}
