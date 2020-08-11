package tutorial.java.object;

public class MainApp {

	public static void main(String[] args) {

		Employee emp_1 = new Employee("Bhushan", 67777777.77);
		
		// toString
		System.out.println("emp_1 - " + emp_1);
//		System.out.println("emp_1 - " + emp_1.toString());
		
		// getClass
//		String className = emp_1.getClass().getName();
//		System.out.println("className - " + className);
		
		// hashCode()
//		System.out.println("hashcode - employee - " + emp_1.hashCode());
//		System.out.println("hashcode - employee - " + Integer.toHexString(emp_1.hashCode()));
				
		// equals()
		Employee emp_2 = emp_1;		
//		Employee emp_2 = new Employee();
//		boolean result = emp_1.equals(emp_2);
		System.out.println("emp_2 - " + emp_2);
//		System.out.println("equals - result - " + result);
		
		Employee emp_3 = emp_2;
		System.out.println("emp_3 - " + emp_3);
		
//		Student student = new Student();
//		System.out.println("student - " + student);
		
		
		boolean emp_1_emp_2 = emp_1.equals(emp_2);
		System.out.println("emp_1_emp_2 - " + emp_1_emp_2);

		boolean emp_1_emp_3 = emp_1.equals(emp_3);
		System.out.println("emp_1_emp_3 - " + emp_1_emp_3);

		boolean emp_2_emp_3 = emp_2.equals(emp_3);
		System.out.println("emp_2_emp_3 - " + emp_2_emp_3);
		
		
	}

}
