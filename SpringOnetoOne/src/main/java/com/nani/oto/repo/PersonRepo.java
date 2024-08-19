package com.nani.oto.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nani.oto.entity.Passperson;

public interface PersonRepo extends JpaRepository<Passperson, Integer>{

}
