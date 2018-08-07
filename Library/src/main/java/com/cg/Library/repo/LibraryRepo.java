package com.cg.Library.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.Library.dto.Book;

@Repository("Libraryrepo")
public interface LibraryRepo extends CrudRepository<Book, Integer>{

	
	

}
