package tutorial.java.enumdemo;

public class MainApp {

	public static void main(String[] args) {
		
//		Level[] levels = Level.values();
//		for (Level level : levels) {
//			System.out.println("--" + level.getLevel());
//		}
		
		String employeeType = EmployeeType.PRINCIPAL.getType();
		System.out.println("employeeType - " + employeeType);
		
	}

}
