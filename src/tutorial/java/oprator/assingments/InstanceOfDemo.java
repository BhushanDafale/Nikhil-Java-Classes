package tutorial.java.oprator.assingments;

public class InstanceOfDemo {

	public static void main(String[] args) {
		
		Employee emp = new Employee();		
		Person person = new Person();	
		Student student = new Student();
		String name = "Bhushan";
		Integer i = new Integer(101);
		
		Object[] object = new Object[5];
		object[0] = emp;
		object[1] = person;
		object[2] = student;
		object[3] = name;
		object[4] = i;
		
		for (Object obj : object) {
			System.out.println("------------------");
			if(obj instanceof Employee) {
				Employee e = (Employee) obj;
			} else if (obj instanceof Person) {
				Person p = (Person) obj;
			} else if (obj instanceof Student) {
				Student s = (Student) obj;
			} else if (obj instanceof String) {
				String n = (String) obj;
			} else if (obj instanceof Integer) {
				Integer it = (Integer) obj;
			}
		}
	}
	
	static class Employee {
		
	}
	
	static class Person {
		
	}
	
	static class Student {
		
	}

}


