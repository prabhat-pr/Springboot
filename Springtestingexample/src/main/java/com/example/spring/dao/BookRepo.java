package com.example.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.spring.model.Book;
@Repository
public interface BookRepo extends JpaRepository<Book, Integer>{
	@Query("select case when count(b)>0 then true else false end from Book b where b.id=:id")
	public boolean isBookExistById(@Param("id")int id);
}
