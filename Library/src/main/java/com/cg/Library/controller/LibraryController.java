package com.cg.Library.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Library.dto.Book;
import com.cg.Library.service.LibraryService;



@RestController
public class LibraryController {
	@Autowired
	private LibraryService service;
	
	@RequestMapping("/books")
	public List<Book> getAllBooks() {
		return service.getAllBooks();
	}

	@RequestMapping("/books/{id}")
	public Optional<Book> getBookById(@PathVariable int id) {
		return service.getBookById(id);

	}

	@RequestMapping(value = "/books", method = RequestMethod.POST)
	public void addBook(@RequestBody Book b) {
		service.addBook(b);
	}

	@RequestMapping(value = "/books/{id}", method = RequestMethod.DELETE)
	public void DeleteBook(@PathVariable int id) {
		service.deleteBook(id);
	}
	
	@RequestMapping(value = "/books/{id}", method = RequestMethod.PUT)
	public void UpdateBook(@RequestBody Book b,@PathVariable int id) {
		service.updateBook(b, id);
	}
}
