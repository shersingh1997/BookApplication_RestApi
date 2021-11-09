package com.springboot.Api.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.Api.entity.Book;

@Service
public class BookService 
{
	
	
	private static List<Book>booklist =new ArrayList<>();
	
	static
	{
		booklist.add(new Book(25,"os","gelvin"));
		booklist.add(new Book(26,"mahabharat","valmiki"));
		booklist.add(new Book(27,"dbms","waghe"));
	}
	
	public List<Book> getallbook()
	{
		return booklist;
	}
	
	
	public Book getbookbyid(int id)
	{
		Book b=null;
		b=booklist.stream().filter(e->e.getId()==id).findFirst().get();
		return b;
	}


	public Book addbook(Book book) 
	{
		booklist.add(book);
		return book;
		
		
	}
	
	
}
