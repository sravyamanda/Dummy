package com.cg.Library.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Library.dto.Book;
import com.cg.Library.repo.LibraryRepo;

@Service
public class LibraryServiceImpl implements LibraryService{
	@Autowired
	private LibraryRepo repo;

	@Override
	public void addBook(Book b) {
		
		repo.save(b);
	}

	@Override
	public void updateBook(Book b,int id) {
		Book book = new Book();
		book.setId(id);
		book.setName(b.getName());
		book.setAuthor(b.getAuthor());
		repo.save(b);
		
	}

	@Override
	public void deleteBook(int id) {
		repo.deleteById(id);
		
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> list = new ArrayList<>();
		repo.findAll().forEach(list::add);
		return list; 
	}

	@Override
	public Optional<Book> getBookById(int id) {
		
		return repo.findById(id);
	}

}
