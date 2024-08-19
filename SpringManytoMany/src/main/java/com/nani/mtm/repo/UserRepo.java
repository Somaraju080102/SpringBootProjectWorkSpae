package com.nani.mtm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nani.mtm.entity.Users;

public interface UserRepo  extends JpaRepository<Users, Integer>{

}
