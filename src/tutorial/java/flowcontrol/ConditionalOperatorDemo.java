package tutorial.java.flowcontrol;

public class ConditionalOperatorDemo {

	public static void main(String[] args) {

		int a = 50;
		int b = 40;
		int c = 30;
		
//		if(a > b && a > c) {
//			System.out.println("a is big");
//		} else if(b > a && b > c) {
//			System.out.println("b is big");
//		} else {
//			System.out.println("c is big");
//		}
		
		// (condition) ? <true> : <false>
//		String result = (a < b) ? "Small" : "Big";
//		System.out.println("result - " + result);
		
		
		String result = (a > b && a > c) ? print(): (b > a && b > c) ? "b is big" : "c is big";
		System.out.println("result - " + result);
	}

	private static String print() {
		// TODO Auto-generated method stub
		return null;
	}

}
