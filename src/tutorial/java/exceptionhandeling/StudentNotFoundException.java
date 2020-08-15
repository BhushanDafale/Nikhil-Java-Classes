package tutorial.java.exceptionhandeling;

public class StudentNotFoundException extends RuntimeException {
	
	public StudentNotFoundException() {
		super();
	}
	
	public StudentNotFoundException(String message) {
		super(message);
	}
	
}
