package com.jspiders.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jspiders.sms.entity.Student;
import com.jspiders.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		    Student s1 = new Student("Chandan", "Kumar", "chandan@gmail.com");
//		    studentRepository.save(s1);
//			 
//		      Student s2 = new Student("Pankaj", "Kumar", "pankaj@gmail.com");
//			    studentRepository.save(s2);
	 
			  Student s3 = new Student("Amod", "Kumar", "amod@gmail.com");
			 studentRepository.save(s3);
					
	}

}
