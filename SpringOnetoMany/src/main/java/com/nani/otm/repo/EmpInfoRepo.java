package com.nani.otm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nani.otm.entity.Empinfo;

public interface EmpInfoRepo extends JpaRepository<Empinfo, Integer> {

}
