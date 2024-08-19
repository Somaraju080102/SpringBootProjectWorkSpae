package com.nani.bookstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bookstore {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bid;
	
	private String  bname;
	
	private String  bauthor;

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}

	@Override
	public String toString() {
		return "Bookstore [bid=" + bid + ", bname=" + bname + ", bauthor=" + bauthor + "]";
	}
	
	
	

}
