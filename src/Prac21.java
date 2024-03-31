class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
}

public class Prac21 {
	public static void main(String args[]) {
		Person p1 = new Person("Rishit", 20);
	
		System.out.println("Person Name: " + p1.getName());
		System.out.println("Person Age: " + p1.getAge());
	}
}
