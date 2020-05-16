package com.demo;

import com.demo.model.Employee;

public class HelloWorld {
	
	public static void main(String[] agrs) {

		Integer test = 20;
		
		// object creation
		Employee emp; 
		emp = new Employee(); 
		emp.setFirstName("Nikhil");
		emp.setLastName("Dafale");
		emp.setSalary(100000000);
		emp.setAge(27);
		
		
		System.out.println(emp.getFirstName() + " salary is: " + emp.getSalary());
		
	}
	
}
