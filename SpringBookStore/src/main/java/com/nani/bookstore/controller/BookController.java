package com.nani.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nani.bookstore.entity.Bookstore;
import com.nani.bookstore.repo.BookRepo;
import com.nani.bookstore.service.BookService;

@Controller
public class BookController {
	
	@GetMapping("/book")
	public ModelAndView loadBook() {
		
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("bobj", new Bookstore());
		
		mv.setViewName("index");
		
		return mv;
	}
	

	@Autowired
	BookRepo bookRepo;
	
	
	@PostMapping("/book")
	public ModelAndView saveBook(Bookstore bookstore) {
		
		if(bookstore.getBname()!=null) {
		bookRepo.save(bookstore);
		}
		
		
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg", "Books Added Succesfully");
		mv.setViewName("success");
		
		return mv;
		
	}
	
	@GetMapping("/viewall")
	public ModelAndView getBook() {
		
	List<Bookstore>bs= bookRepo.findAll();
		
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("ball",bs);
		mv.setViewName("books");
		return mv;
		
		
	}
	

}
