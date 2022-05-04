package com.jason.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jason.sms.entity.Student;
import com.jason.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) throws Exception {                                 //Exception Handling 
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired              
	private StudentRepository studentRepository;
@Override
public void run(String... args) throws Exception {
	
	Student student1 = new Student("Ramesh", "Fadatare", "ramesh@gmail.com");                  //Pre-added Inputs
	
	studentRepository.save(student1);
	
	Student student2 = new Student("Sanjay","Jadhav","sanjay@gmail.com");
	studentRepository.save(student2);
	
	Student student3 = new Student("Faraz","Aktar","faraz@gmail.com");
	studentRepository.save(student3);
}
}
