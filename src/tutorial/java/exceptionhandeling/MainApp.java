package tutorial.java.exceptionhandeling;

public class MainApp {

	public static void main(String[] args) {
		
		String str = "Bhushan";	
		System.out.println("str - " + str);
		
		try {
			System.out.println("--inside try");
			
			str.toLowerCase();
			
			System.out.println("--try end");
			
			int a = 10/0;
			
		} catch(ArithmeticException e) {
			System.out.println("AE-- exception occured: " + e.toString());
		} catch(NullPointerException e) {
			System.out.println("NP-- exception occured: " + e.toString());
		} finally {
			System.out.println("-- finally block");
		} 
		
		System.out.println("---- end of program");
		
	}

}
