package tutorial.java.staticdemo;

public class StaticSubClass extends StaticSuperClass {
	
	// method hiding
	public static void display() {
		int a = StaticSuperClass.a;
	}
	
}
