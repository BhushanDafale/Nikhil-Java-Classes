package java.fun.part2;

public class Cat extends Animal implements AnimalI {
	
	// ovverriding from AnimalI interface
	public void walk() {			
		System.out.println("Cat can walk");
	}
	
	// ovverriding from AnimalI interface
	public void talk() {
		System.out.println("Cat can mow");				
	}


}