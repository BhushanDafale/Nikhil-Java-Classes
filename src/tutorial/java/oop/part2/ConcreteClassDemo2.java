package tutorial.java.oop.part2;

public class ConcreteClassDemo2 extends AbstractClassDemo implements InterfaceDemo {

	@Override
	public void printOne() {
		System.out.println("One - From ConcreteClassDemo2");
	}

	@Override
	public void printTwo() {
		System.out.println("Two - From ConcreteClassDemo2");
	}

	@Override
	public void printFour() {
		System.out.println("Four - From ConcreteClassDemo2");
	}		
	
}
