package java.fun.part2;

public class MainApp {
	
	public static void main(String... args) {
		
		Dog dog = new Dog();
		dog.color = "black";
		dog.bread = "A1";
		dog.age = 5;
		dog.weight = 6.9;
		dog.walk();
		dog.talk();
		String dogInfo = dog.info();
		System.out.println("dogInfo: " + dogInfo);		
		
		System.out.println("----------------------------");
		
		Cat cat = new Cat();
		cat.color = "white";
		cat.bread = "C1";
		cat.age = 2;
		cat.weight = 4;
		cat.walk();
		cat.talk();
		String catInfo = cat.info();
		System.out.println("catInfo: " + catInfo);		
		

		System.out.println("----------------------------");
		
		Tiger tiger = new Tiger();
		tiger.color = "Black Yellow Strips";
		tiger.bread = "T1";
		tiger.age = 20;
		tiger.weight = 45;
		tiger.walk();
		tiger.talk();
		String tigerInfo = tiger.info();
		System.out.println("tigerInfo: " + tigerInfo);		

	}

}