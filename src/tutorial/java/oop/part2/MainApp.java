package tutorial.java.oop.part2;

public class MainApp {

	public static void main(String[] args) {
		
		// type = object
		ConcreteClassDemo1 c1 = new ConcreteClassDemo1();
		c1.printOne();
		c1.printTwo();
		c1.printThree();
		c1.printFour();
		
		System.out.println("------------------------------------------");
		
		AbstractClassDemo c2 = new ConcreteClassDemo1();	
		c2.printOne();
		c2.printTwo();
		c2.printThree();
		c2.printFour();

		System.out.println("------------------------------------------");

		InterfaceDemo c3 = new ConcreteClassDemo1();
		c3.printOne();
		c3.printTwo();
		c3.printThree();

	}

}
