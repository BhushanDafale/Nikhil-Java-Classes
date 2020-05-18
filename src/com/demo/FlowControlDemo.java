package com.demo;

import java.util.Scanner;

public class FlowControlDemo {
	
	public static void main(String[] args) {
		
		int add = method();
		System.out.println("-- inside main: "+ add);
		
	}

	public static int method() {
		int add = 10 + 30;
		return add;
	}
	
}
