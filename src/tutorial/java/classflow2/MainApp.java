package tutorial.java.classflow2;

public class MainApp extends SuperClass {
	
	// instance block
	{
		System.out.println("--MainApp instance block");
	}
	
	// static block
	static {
		System.out.println("--MainApp static block");		
	}
	
	// constructor - use to create object and allocate memory to instance variables
	public MainApp() {
		System.out.println("--MainApp Constructor");		
	}
	
	// instance method
	public void display() {
		System.out.println("--MainApp display method");		
	}
	
	// static method
	public static void print() {
		System.out.println("--MainApp print method");		
	}
	
	public static void main(String[] args) {
		System.out.println("--MainApp main start");		
		
		System.out.println("-------------------------------");		
		
		MainApp mp1 = new MainApp();
		
		System.out.println("-------------------------------");		
		MainApp mp2 = new MainApp();

		System.out.println("-------------------------------");		
		MainApp mp3 = new MainApp();

		System.out.println("-------------------------------");		
		System.out.println("--MainApp main end");		
	}	

}
