class Student {
	String name;
	int rollNo;
	double totalMarks;
	
	Student() {
		name = "Default_Name";
		rollNo = 0;
		totalMarks = 100.00;
	}
	
	Student(String name, int rollNo, double totalMarks) {
		this.name = name;
		this.rollNo = rollNo;
		this.totalMarks = totalMarks;
	}
	
	void displayInfo() {
		System.out.println("Student Name: " + name);
		System.out.println("Student Roll Number: " + rollNo);
		System.out.println("Student Total Marks: " + totalMarks);
	}
}

public class Prac22 {
	public static void main(String args[]) {
		Student s1 = new Student();
		Student s2 = new Student("Name", 111, 85.62);
		
		System.out.println("Default Student Info: ");
		s1.displayInfo();
		System.out.println("\nStudent Info Inputed: ");
		s2.displayInfo();
	}
}
