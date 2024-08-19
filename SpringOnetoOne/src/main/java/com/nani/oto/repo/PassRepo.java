package com.nani.oto.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nani.oto.entity.Passinfo;

public interface PassRepo extends JpaRepository<Passinfo, Integer> {

}
