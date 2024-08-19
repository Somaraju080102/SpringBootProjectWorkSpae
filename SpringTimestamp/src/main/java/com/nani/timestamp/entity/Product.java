package com.nani.timestamp.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.zaxxer.hikari.util.ClockSource.Factory;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private Integer pid;
	
	private String pname;
	
	private Double price;
	
	@Column(updatable = false)
	@CreationTimestamp
	private LocalDate currentdate;
	
	@Column(insertable =false )
	@UpdateTimestamp
	private LocalDate  updatedate;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getCurrentdate() {
		return currentdate;
	}

	public void setCurrentdate(LocalDate currentdate) {
		this.currentdate = currentdate;
	}

	public LocalDate getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(LocalDate updatedate) {
		this.updatedate = updatedate;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", currentdate=" + currentdate
				+ ", updatedate=" + updatedate + "]";
	}
	
	
	
	

}
