package tutorial.java.classflow2;

public class SuperClass {
	
	// instance block
	{
		System.out.println("--SuperClass instance block");
	}
	
	// static block
	static {
		System.out.println("--SuperClass static block");		
	}
	
	// constructor - use to create object and allocate memory to instance variables
	public SuperClass() {
		System.out.println("--SuperClass Constructor");		
	}
	
	// instance method
	public void display() {
		System.out.println("--SuperClass display method");		
	}
	
	// static method
	public static void print() {
		System.out.println("--SuperClass print method");		
	}
	
}
