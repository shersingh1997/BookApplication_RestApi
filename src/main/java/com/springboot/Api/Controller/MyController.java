package com.springboot.Api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Api.Services.BookService;
import com.springboot.Api.entity.Book;

@RestController
public class MyController 
{
	@Autowired
	private  BookService bookservice;
	
	@GetMapping("/books")
	public List<Book> getbooks()
	{
		return bookservice.getallbook();
	}
	
	
	@PostMapping("/addbook")
	public Book addbook(@PathVariable("book") @RequestParam Book book)
	{
		Book b1=bookservice.addbook(book);
		return b1;
	}

}
