package com.demo;

import com.demo.model.Employee;
import com.demo.model.Student;

public class HelloWorld {
	
	public static void main(String[] agrs) {

//		Integer test = 20;		
//		
//		// object creation
//		Employee emp; 
//		emp = new Employee(); 
//		emp.setFirstName("Nikhil");
//		emp.setLastName("Dafale");
//		emp.setSalary(100000000);
//		emp.setAge(27);
//		
		Student student = new Student(); 
		student.setFirstName("Nikhil");
		student.setLastName("Dafale");
		student.setAge(28);
		
		Student student2 = new Student("Bhushan", "Dafale", 29);
//		
//		
//		System.out.println(emp.getFirstName() + " salary is: " + emp.getSalary());
		
	}
	
}
