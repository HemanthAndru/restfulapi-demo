package com.hemanth.demo.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hemanth.demo.model.Books;
import com.hemanth.demo.services.BookServices;

@RestController
public class BookResources {

	@Autowired
	private BookServices bookServices;
	
	
	@GetMapping("/books")
	public List<Books> getBooks(){
		return bookServices.getBooks();
	}
	
	public void createBook(Books book) {
		
	}
	
}
