package com.example.welcome;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.welcome.dao.CustomerRepository;
import com.example.welcome.model.Customer;

@SpringBootApplication
public class JpaexampleApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(JpaexampleApplication.class, args);
		
	CustomerRepository cr=context.getBean(CustomerRepository.class);
	
	Customer c=new Customer(12, "nishant", "mumbai");
	Customer c1=new Customer(13, "rahul", "pune");
	Customer c2=new Customer(14, "disha", "Ghaziabad");
	Customer c3=new Customer(15, "ritesh", "noida");
	Customer c4=new Customer(16, "mayank", "delhi");
	/*
	 * for(Customer cust:itr) System.out.println(cust);
	 */
	
	 // List<Customer> clist=List.of(c, c1,c2,c3,c4);
	  
	  //itr.forEach(cust->{System.out.println(cust);});
	 
	/*
	 * Iterable<Customer> itr= cr.findAll(); for(Customer cust:itr)
	 * System.out.println(cust);
	 */
	
	// single customer fetch
	/*
	 * Optional<Customer> obj= cr.findById(13); Customer rec=obj.get();
	 */
	
	//update
	/*
	 * rec.setName("neha"); rec.setAddress("goa"); Customer saved=cr.save(rec);
	 * System.out.println(saved);
	 * 
	 * cr.deleteById(12);
	 */
	/*
	 * Iterable<Customer> itr=cr.findByCustidGreaterThan(13); for(Customer cust:itr)
	 * System.out.println(cust);
	 */
	
	/* Customer ctr=cr.findByAddressLike("noida"); System.out.println(ctr); */
	/*
	 * Customer ctr1=cr.findByNameAndAddressLike("nihal","surat");
	 * System.out.println(ctr1);
	 * 
	 * 
	 * Customer ctr=cr.findByNameLike("mayank"); System.out.println(ctr);
	 * 
	 * Iterable<Customer> itr= cr.findByCustidGreaterThan(13);
	 * 
	 * for(Customer cust:itr) System.out.println(cust);
	 */
	
	Customer ctr=cr.getbynameandaddress("disha", 14);
	System.out.println(ctr);
}}
