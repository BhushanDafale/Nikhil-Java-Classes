package tutorial.java.enumdemo;

public enum EmployeeType {
	
	/*
	 * public static final EmployeeType INTERN = new EmployeeType();
	 * public static final EmployeeType HOD = new EmployeeType();
	 * public static final EmployeeType PROFESSOR = new EmployeeType();
	 * public static final EmployeeType PRINCIPAL = new EmployeeType();
	 */
	
	INTERN("intern"), 
	HOD("hod"), 
	PROFESSOR("professor"), 
	PRINCIPAL("principal");
	
	private final String type;
	
	private EmployeeType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}	
	
}
