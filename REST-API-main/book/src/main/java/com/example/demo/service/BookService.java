package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	BookRepository repository;
	
	public boolean addBook(Book book) {
		repository.save(book);
		return true;
	}

	public List<Book> readBook() {
		return repository.findAll();
	}

	public Optional<Book> readBookById(int id) {
		return repository.findById(id);
	}

	public Book updateBook(Book book) {
		repository.save(book);
		return book;
	}

	public Boolean deleteBook(int id) {
		repository.deleteById(id);
		return true;
	}

}
