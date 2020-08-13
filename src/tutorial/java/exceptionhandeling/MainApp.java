package tutorial.java.exceptionhandeling;

public class MainApp {

	public static void method_A() {
		System.out.println("--method_A start");
		method_B();
		System.out.println("--method_A end");
	}

	public static void method_D() {
		System.out.println("--method_D end");
	}

	public static void method_C() {
		System.out.println("--method_C start");

		int a = 10 / 0; // AE
		System.out.println("---after exception");
		method_D();
		System.out.println("--method_C end");
	}

	public static void main(String[] args) {
		System.out.println("--main start");

		try {
			method_A();
		} catch (Exception e) {
			System.out.println("-AE----");
		}

		System.out.println("--main end");
	}

	public static void method_B() {
		System.out.println("--method_B start");
		method_C();
		System.out.println("--method_B end");
	}
}