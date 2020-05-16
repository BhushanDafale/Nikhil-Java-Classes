package com.demo;

import com.demo.model.Address;
import com.demo.model.Employee;

public class ArrayDemo {

	public static void main(String[] args) {
		
//		int count = 1;
//		
//		int[][] a = new int[3][];
//		
//		a[0] = new int[2];
//		a[1] = new int[5];
//		a[2] = new int[4];
//		
//		for(int i = 0; i < a.length;i++) {
//			System.out.println("-----------a["+i+"]: " + a[i].length);
//			for(int j = 0; j < a[i].length; j++) {
////				count += j;
////				a[i][j] = count;
//				System.out.println(">>j["+i+"]["+j+"]: " + a[i][j]);
//			}
//		}
		
		int[] a = new int[5];
		
		Employee[] emp = new Employee[3];
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		emp[0] = e1;
		emp[1] = e2;
		emp[2] = e3;
		
		for(int i=0; i< emp.length; i++) {
			System.out.println("emp["+i+"]: " + emp[0]);
		}
		
		Address[][] adr = new Address[3][4];
		adr[0][0] = new Address();
		
	}
		
}
