package tutorial.java.classflow1;

public class MainApp {
	
	// object call -- only for instance members (variable/method)
//	MainApp mp = new MainApp();
	
	// static call -- for static members (variable/method)
	// MainApp or mp
	
	// instance variable
	int a = 10; 
	
	// static variable
	static int b = 10; 	

	// instance block
	{
		System.out.println("--instance block");
	}
	
	// static block
	static {
		System.out.println("--static block" + b);		
	}
	
	// constructor - use to create object and allocate memory to instance variables
	public MainApp() {
		System.out.println("--MainApp Constructor");		
	}
	
	// instance method
	public void display() {
		System.out.println("--display method");		
	}
	
	// static method
	public static void print() {
		System.out.println("--print method");		
	}
	
	public static void main(String[] args) {
		System.out.println("--main start");		
		
		MainApp mp1 = new MainApp();
		
		MainApp mp2 = new MainApp();

		MainApp mp3 = new MainApp();

		System.out.println("--main end");		
	}	

}
