package com.cdac.JPA.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.cdac.JPA.model.Student;

/*<Entity, datatype of primary key>*/
public interface StudentRepository extends CrudRepository<Student,Integer > 
{
	public Student findByNameLike(String name);
	public List<Student>findByidGreaterThan(Integer id);
	public Student findByNameAndAddressLike(String data, String add);
	
	@Query("select s from Student s where s.name =:n and s.id=:s")
	public Student getByNameAndAddress(@Param("n")String name,@Param("s")Integer id);

}