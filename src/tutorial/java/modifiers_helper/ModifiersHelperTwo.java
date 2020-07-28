package tutorial.java.modifiers_helper;

import tutorial.java.modifiers.revise.part2.ModifiersHelper;

public class ModifiersHelperTwo extends ModifiersHelper {
	
	ModifiersHelper modifiersHelper = new ModifiersHelper();

//	ModifiersHelperTwo modifiersHelperTwo = new ModifiersHelperTwo();
	
	// package level access 
			
			int val = modifiersHelper.val;
			
			static int val1 = ModifiersHelper.val1;
			
			public void dummy() {
				modifiersHelper.valMehtod();

				ModifiersHelper.valMehtod(10);
			}
			
			
	// ----------------------		

	
	// instance variable 
	public int a = 10;

	// static variable 
	public static int a1 = 10;
	
	// instance variable 
	private int b = 20;
	// static variable 
	private static int b1 = 10;
	
	// instance method 
	public void display() {
		// todo
	}

	// instance method 
	private void display(int a) {
		// todo
	}
}
