package com.nani.bookstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nani.bookstore.entity.Bookstore;

public interface BookRepo extends JpaRepository<Bookstore, Integer> {
	

}
