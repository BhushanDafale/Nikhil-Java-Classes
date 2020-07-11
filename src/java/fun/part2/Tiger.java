package java.fun.part2;

public class Tiger extends Animal implements AnimalI {
		
	// ovverriding from AnimalI interface
	public void walk() {			
		System.out.println("Tiger can walk");
	}
	
	// ovverriding from AnimalI interface
	public void talk() {
		System.out.println("Tiger can talk");				
	}
	
}