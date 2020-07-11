package java.fun.part2;

public class Dog extends Animal implements AnimalI {
	
	// ovverriding from AnimalI interface
	public void walk() {			
		System.out.println("Dog can walk");
	}
	
	// ovverriding from AnimalI interface
	public void talk() {
		System.out.println("Dog can bark");				
	}
		
}