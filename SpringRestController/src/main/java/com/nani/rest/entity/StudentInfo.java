package com.nani.rest.entity;

import org.springframework.stereotype.Component;

@Component
public class StudentInfo {
	
	private Integer id;
	
	private String name;
	
	private Integer age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

//	public StudentInfo(Integer id, String name, Integer age) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.age = age;
//	}

	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	

}
