package com.hemanth.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hemanth.demo.model.Books;

@Component
public class BookServiceImpl implements BookServices{

	static List<Books> li=new ArrayList<>();
	
	static {
		
		li.add(new Books(1,"hemanth","this is the bio of hem.."));
		li.add(new Books(2,"The Lion King","this is the true king lion .. "));
		li.add(new Books(3,"half-girl-friend","the story written by famous writter chetan.."));
		}
	
	@Override
	public List<Books> getBooks() {
		
		return li;
	}

	@Override
	public Books getBookById(int id) {
		
		for(Books book:li) {
			if(book.getBookId()==id) {
				return book;
			}
		}
		
		return null;
	}

	@Override
	public void createBook(Books book) {
		if(isBookExists(book)) {
			return;
		}
		li.add(book);
	}
	
	private boolean isBookExists(Books book) {
		for(Books b:li) {
			if(b.getBookId()==book.getBookId()) {
				return true;
			}
		}
		return false;
	}

}
