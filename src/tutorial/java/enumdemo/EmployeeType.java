package tutorial.java.enumdemo;

public enum EmployeeType {
	
	INTERN("intern"), HOD("hod"), PROFESSOR("professor"), PRINCIPAL("principal");
	
	public final String type;
	
	private EmployeeType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}	
	
}
