package com.cg.Library.service;

import java.util.List;
import java.util.Optional;

import com.cg.Library.dto.Book;

public interface LibraryService {
	public void addBook(Book b);
	public void updateBook(Book b,int id);
	public void deleteBook(int id);
	public List<Book> getAllBooks();
	public Optional<Book> getBookById(int id);
	

}
