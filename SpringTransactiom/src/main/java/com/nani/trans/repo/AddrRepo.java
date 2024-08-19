package com.nani.trans.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nani.trans.entity.Address;

public interface AddrRepo extends JpaRepository<Address, Integer> {

}
