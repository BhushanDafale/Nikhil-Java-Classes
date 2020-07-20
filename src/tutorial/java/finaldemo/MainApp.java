package tutorial.java.finaldemo;

public class MainApp {
	
//	public static final int a = 10;
	
	final int universityName;
	
	public MainApp() {
		// db call to get university name
		//String nameFromDB = "nameFromDB";
		universityName = nameFromDB;
	}
	
	public static void main(String[] args) {
		// **final with local variable
//		final String val = "Bhushan";
//		System.out.println("before change a - " + val);
//		val = "Nikhil";
//		System.out.println("after change a - " + val);
		
		// **final with instance variable .. w.r.t line no. 5
//		a = 20;
	}

}
