package tutorial.java.oop.part2;

public class ConcreteClassDemo1 extends AbstractClassDemo implements InterfaceDemo {

	@Override
	public void printOne() {
		System.out.println("One - From ConcreteClassDemo1");
	}

	@Override
	public void printTwo() {
		System.out.println("Two - From ConcreteClassDemo1");
	}

	@Override
	public void printFour() {
		System.out.println("Four - From ConcreteClassDemo1");
	}
	
//	@Override
//	public void printThree() {
//		System.out.println("Three - From ConcreteClassDemo1");
//	}
//	
	public void printFour(int a) {
		
	}
		
}
