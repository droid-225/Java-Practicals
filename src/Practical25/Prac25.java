package Practical25; // Had to put it into its own package since prac 24 also has a Employee class
// ^^^^^^ Do not copy this part ^^^^^^

public class Prac25 {
	public static void main(String args[]) {
		Teaching t1 = new Teaching("Lizzo Teca", 34, "Music");
		Teaching t2 = new Teaching("Max Fosh", 35, "Maths");
		NonTeaching n1 = new NonTeaching("Charlie Max", 33, "Janitor");
		NonTeaching n2 = new NonTeaching("Jimmy Jenson", 21, "Accountant");
		
		t1.display();
		t2.display();
		n1.display();
		n2.display();
	}
}

class Employee {
	String name;
	int age;
	
	Employee (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

class Teaching extends Employee {
	String name, nameOfSubject;
	int age;
	
	Teaching (String tname, int age, String subject) {
		super(tname, age);
		nameOfSubject = subject;
	}
	
	void display() {
		super.display();
		System.out.println("Subject: " + nameOfSubject + "\n");
	}
}

class NonTeaching extends Employee {
	String name, typeOfWork;
	int age;
	
	NonTeaching (String name, int age, String typeOfWork) {
		super(name, age);
		this.typeOfWork = typeOfWork;
	}
	
	void display() {
		super.display();
		System.out.println("Subject: " + typeOfWork + "\n");
	}
}