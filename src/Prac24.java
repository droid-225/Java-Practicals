import java.util.Scanner;
import java.util.Random;

class Employee {
	Random ran = new Random();
	String name;
	int age, salary, empNo = 0;
	
	Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		empNo = ran.nextInt(10000);
	}
}

public class Prac24 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Employee emps[] = new Employee[10];
		String name;
		int age, salary;
		
		System.out.println("Enter Employee Info: ");
		for(int i = 1; i <= emps.length; i++) {
			System.out.print("Enter Name of Employee " + i + ": ");
			name = in.next();
			System.out.print("Enter Age of Employee " + i + ": ");
			age = in.nextInt();
			System.out.print("Enter Salary of Employee " + i + ": ");
			salary = in.nextInt();
			emps[i-1] = new Employee(name, age, salary);
			System.out.println();
		}
		
		System.out.println("Employee Information:");
		for(Employee e: emps) {
			System.out.println("Name: " + e.name);
			System.out.println("Age: " + e.age);
			System.out.println("Salary: $" + e.salary);
			System.out.println("Employee Number: " + e.empNo);
			System.out.println();
		}
	}
}
