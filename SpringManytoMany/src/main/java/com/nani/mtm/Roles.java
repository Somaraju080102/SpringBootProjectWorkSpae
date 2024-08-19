package com.nani.mtm;

import java.util.HashSet;
import java.util.Set;

import com.nani.mtm.entity.Users;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Roles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rid;
	
	private String rname;
	
	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	@Override
	public String toString() {
		return "Roles [rid=" + rid + ", rname=" + rname + "]";
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public Set<Users> getUsers() {
		return users;
	}

	public void setUsers(Set<Users> users) {
		this.users = users;
	}

	@ManyToMany
	@JoinTable(name = "user_roles",joinColumns = @JoinColumn(referencedColumnName = "rid"),inverseJoinColumns = @JoinColumn(referencedColumnName = "uid"))
	private Set<Users> users=new HashSet<>();
	

}
