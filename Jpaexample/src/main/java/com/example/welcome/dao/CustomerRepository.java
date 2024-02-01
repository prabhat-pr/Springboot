package com.example.welcome.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.welcome.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

	public Customer findByNameLike(String name);
	public Customer findByNameAndAddressLike(String data,String add);
	public List<Customer> findByCustidGreaterThan(Integer id);
	
	@Query("select c from Customer c where c.name=:n and c.custid=:s")
	public Customer getbynameandaddress(@Param("n")String name,@Param("s")Integer id);

	/*
	 * public Iterable<Customer> findByCustidGreaterThan(Integer id); public
	 * Customer findByAddressLike(String data); public Customer
	 * findByNameAndAddressLike(String data,String add);
	 * 
	 * @Query(" select c from Customer c where c.name = :x and c.address=:z") public
	 * Customer getcustomerbyname(@Param("x") String name,@Param("z") String
	 * address);
	 */
	
}
