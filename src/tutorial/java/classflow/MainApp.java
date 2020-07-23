package tutorial.java.classflow;

public class MainApp {
	
	// object call
//	MainApp mp = new MainApp();
	
	// static call
	// MainApp or mp
	
	// instance variable
	int a = 10; 
	
	// static variable
	static int b = 10; 

	
	
	// static block
	static {
		System.out.println("--static block" + b);		
	}
	
	public MainApp() {
		System.out.println("--MainApp Constructor");		
	}
	
	// instance block
	{
		System.out.println("--instance block");
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
