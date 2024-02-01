package com.cdac.JPA;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.cdac.JPA.dao.StudentRepository;
import com.cdac.JPA.model.Student;

@SpringBootApplication
public class JpaSpringBootApplication {
	public static void main(String[] args) {
		// SpringApplication.run(JpaSpringBootApplication.class, args);
		ApplicationContext context = SpringApplication.run(JpaSpringBootApplication.class, args);
		StudentRepository sr = context.getBean(StudentRepository.class);
		System.out.println(sr);
		
		  //Single entity  
			/*
			 * Student st = new Student(1,"John","Delhi",88.5); Student s = sr.save(st);
			 * System.out.println(s);
			 */
		  
		  //Multiple entity
		
//			  Student st1 = new Student(1,"Mahendra","Bangalore",99); 
//			  Student st2 = new Student(2,"Rohit","Noida",99); 
//			  Student st3 = new Student(3,"Sachin","Lucknow",99); 
//			  Student st4 = new Student(4,"Ajeet","Goa",99);
//			  
//			  List<Student> list = List.of(st1, st2, st3,st4); sr.saveAll(list);
//			  Iterable<Student> itr =sr.saveAll(list); for(Student stu:itr)
//			  System.out.println(stu);
			 	 
		// itr.forEach(student->{System.out.println(student); });

		// To view all data from DB
//		  System.out.println("Student ");
//		  Iterable<Student> itr1 = sr.findAll();
//		  itr1.forEach(student->{System.out.println(student); });
		  
		// Update db data
		/*
		 * Optional<Student> obj = sr.findById(13); 
		 * Student s = obj.get();
		 * s.setName("Raja"); s.setMarks(98.5); Student saved = sr.save(s);
		 * System.out.println(saved); System.out.println(s);
		 */
		// Delete db data	
		  //sr.deleteById(15);
		  
		  Student student =sr.findByNameAndAddressLike("Ajeet", "Goa");
		  System.out.println(student);
		  Student stud = sr.findByNameLike("Rohit");
		  System.out.println(stud);

			Iterable<Student> itr =sr.findByidGreaterThan( 1);
			for(Student stu:itr) 
			 System.out.println(stu);
			
			Student sobj = sr.getByNameAndAddress("Mahendra", 1);
			System.out.println(sobj);

			 	}
}