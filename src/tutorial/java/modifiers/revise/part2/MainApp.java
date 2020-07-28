package tutorial.java.modifiers.revise.part2;

import tutorial.java.modifiers_helper.ModifiersHelperTwo;

public class MainApp {

	public static void main(String[] args) {
		ModifiersHelper modifiersHelper = new ModifiersHelper();

// package level access 
		
		int val = modifiersHelper.val;
		
		int val1 = ModifiersHelper.val1;
		
		modifiersHelper.valMehtod();
		
		ModifiersHelper.valMehtod(10);
		
// ----------------------		
		
// same package		
		
		// public instance variable
		int a = modifiersHelper.a;
		
		// private instance variable
		int b = modifiersHelper.b;
		
		// public instance method
		modifiersHelper.display();
		
		// private instance method
		modifiersHelper.display(10);
		
		// static --------------
		
		// public
		int a1 = ModifiersHelper.a1;
		
		// private
		int b1 = ModifiersHelper.b1;
		
// diff package
		ModifiersHelperTwo modifiersHelperTwo = new ModifiersHelperTwo();
		
		// public instance variable
		int atwo1 = modifiersHelperTwo.a;
		
		// private instance variable
		int btwo1 = modifiersHelperTwo.b;
		
		// public instance method
		modifiersHelperTwo.display();
		
		// private instance method
		modifiersHelperTwo.display(10);
		
		// static --------------
		
		// public
		int a11 = ModifiersHelperTwo.a1;
		
		// private
		int b11 = ModifiersHelperTwo.b1;

		
	}

}
