package com.nani.pk.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

/**
 * 
 */
@Entity
public class Person {
	
	private String name;
	
	private Integer age;
	
	@EmbeddedId
	private PersonPk pk;

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

	public PersonPk getPk() {
		return pk;
	}

	public void setPk(PersonPk pk) {
		this.pk = pk;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age+"]";
	}
	
	
	

}
