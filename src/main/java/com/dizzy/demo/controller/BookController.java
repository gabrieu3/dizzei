package com.dizzy.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dizzy.demo.repository.BookRepository;
import com.dizzy.demo.model.Book;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookRepository booksRepository;
	
	@GetMapping
	public List<Book> find(){
		return booksRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Book save(@RequestBody Book drug){
		System.out.println(drug.toString());
		return booksRepository.save(drug);
		
	}	
}
