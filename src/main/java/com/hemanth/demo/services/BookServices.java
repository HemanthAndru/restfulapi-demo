package com.hemanth.demo.services;

import java.util.List;

import com.hemanth.demo.model.Books;

public interface BookServices {

	public List<Books> getBooks();
	public Books getBookById(int id);
	public void createBook(Books book);
}
