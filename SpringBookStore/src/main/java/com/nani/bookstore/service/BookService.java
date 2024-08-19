package com.nani.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nani.bookstore.entity.Bookstore;
import com.nani.bookstore.repo.BookRepo;

@Service
public class BookService {
	
	@Autowired
	BookRepo bookRepo;
	
	public void saveBook() {
		
		bookRepo.save(bookstore);
		
		System.out.println("Book Saved into Database");
		
	}
	
	
	
	

}
