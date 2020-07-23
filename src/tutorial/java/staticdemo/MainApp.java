package tutorial.java.staticdemo;

public class MainApp {
	
	// specifier type variable-name = value
	static int a = 10;
	int b = 20;
	
	public static void main(String[] args) {

		Object obj = new Object();
		obj.
	
		
		MainApp ma1 = new MainApp();
		ma1.b++; // b = b + 1;
		System.out.println("ma1: b - " + ma1.b);
		
		MainApp ma2 = new MainApp();
		ma2.b++;
		ma2.b++;
		ma2.b++;
		System.out.println("ma1: b - " + ma2.b);
		
		System.out.println("before: a - " + a);
		System.out.println("ma1: a - " + ma1.a);
		System.out.println("ma2: a - " + ma2.a);
		a++;
		System.out.println("after a - " + a);
		increment();
		System.out.println("ma1: a - " + ma1.a);
		System.out.println("ma2: a - " + ma2.a);
		
//		StaticHelper sh = new StaticHelper();
//		System.out.println(sh.a);
//		
//		System.out.println(sh.b);
//		System.out.println(StaticHelper.b);
//		
//		StaticHelper.display();
		
	}
	
	public static void increment() {
		a++;
	}

}
