package com.example.spring.dao;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.spring.model.Book;

@SpringBootTest
public class BookRepoTest {
	@Autowired
	BookRepo bookRepo;
	@BeforeEach
	void Startup()
	{
		System.out.println("resource allocation");
		Book b=new Book(12,"complete reference of java","harbert schildt");
		bookRepo.save(b);
	}
	
	@Test
	void isbookexistbyidtest()
	{
		
		boolean actual=bookRepo.isBookExistById(12);
		assertThat(actual).isTrue();
	}
	@AfterEach
	void shutdown()
	{
		System.out.println("resource releasing");
		bookRepo.deleteAll();
	}
}
