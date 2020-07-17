package tutorial.java.oop.part2;

// partial abstraction
public abstract class AbstractClassDemo implements InterfaceDemo {
	
	public AbstractClassDemo() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printThree() {
		System.out.println("Three - From AbstractClassDemmo");
	}
	
	public abstract void printFour();

	@Override
	public void printOne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printTwo() {
		// TODO Auto-generated method stub
		
	}
	
}
