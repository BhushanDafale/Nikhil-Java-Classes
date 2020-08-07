package tutorial.java.flowcontrol;

public class SwitchDemo {

	public static void main(String[] args) {
		
		int choice = 30;		
		
		// integral type - byte(Byte), short(Short), int(Interger), long(Long)
		// boolean - true, false
		// char - ''
		// String - ""
		// enum 
	
		// switch..case..default
		// key - choice
		switch (choice) {
		case 20:
		case 30:
			System.out.println("--30");
			break;
		case 10:
			System.out.println("--10");
			break;
		default:
			System.out.println("--default");
			break;
		}
		
	}

}
