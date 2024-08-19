package com.nani.timestamp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nani.timestamp.entity.Product;

public interface Timerepo extends JpaRepository<Product, Integer> {

}
