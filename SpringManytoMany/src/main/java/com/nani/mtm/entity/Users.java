package com.nani.mtm.entity;

import java.util.HashSet;
import java.util.Set;

import com.nani.mtm.Roles;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uid;
	private String uname;
	
	@Override
	public String toString() {
		return "Users [uid=" + uid + ", uname=" + uname + ", uphno=" + uphno + ", roles=" + roles + "]";
	}

	private String uphno;
	
	@ManyToMany(mappedBy = "users",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Set<Roles>  roles=new HashSet<>();

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUphno() {
		return uphno;
	}

	public void setUphno(String uphno) {
		this.uphno = uphno;
	}

	public Set<Roles> getRoles() {
		return roles;
	}

	public void setRoles(Set<Roles> roles) {
		this.roles = roles;
	}
	
	
	
	
	

}
