package tutorial.java.methods;

public class SubClass extends SuperClass {

	@Override
	public int add(int a, int b) {
		return 100 + a + b;
	}
	
	@Override
	public int add(int a, int b, int c) {
		return 100 + a + b + c;
	}
	
	public int add(int a, int b, int c, int d) {
		return 10;
	}
	
}
