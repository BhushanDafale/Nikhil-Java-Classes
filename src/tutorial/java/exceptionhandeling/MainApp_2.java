package tutorial.java.exceptionhandeling;

import java.util.Scanner;

public class MainApp_2 {

	public MainApp_2() throws StudentNotFoundException, ArithmeticException, NullPointerException, ClassCastException {
	}
	
	public static void main(String[] args) throws NullPointerException {
	}
		Student[] students = new Student[3];
		Student student_1 = new Student(123, "Bhushan");
		Student student_2 = new Student(456, "Nikhil");
		Student student_3 = new Student(789, "Preeti");
		students[0] = student_1;
		students[1] = student_2;
		students[2] = student_3;

		Scanner scan = new Scanner(System.in);
		System.out.print("RollNO > ");
		int rollNo = scan.nextInt();

		boolean flag = false;
		
		for (Student student : students) {
			if (student.getRoolNo() == rollNo) {
				System.out.println("Roll No: " + student.getRoolNo() + ", Name: " + student.getName());
				flag = true;
				break;
			} 
		}
		
		if(!flag) {
			throw new StudentNotFoundException("Student " + rollNo + " not found");
//			throw new ArithmeticException("Student " + rollNo + " not found"); // CE
		}

	}

	static class Student {
		private Integer roolNo;
		private String name;

		public Student(Integer roolNo, String name) {
			super();
			this.roolNo = roolNo;
			this.name = name;
		}

		public Integer getRoolNo() {
			return roolNo;
		}

		public String getName() {
			return name;
		}
	}

}
