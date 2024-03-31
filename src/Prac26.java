public class Prac26 {
	public static void main(String args[]) {
		Activa a = new Activa(2, "Blue");
		Jeep j = new Jeep(4, "Red");
		
		System.out.println("Information About Activa:");
		a.display();
		
		System.out.println("\nInformation About Jeep:");
		j.display();
	}
}

class Vehicle {
	int NoOfWheels;
	
	Vehicle(int NoOfWheels) {
		this.NoOfWheels = NoOfWheels;
	}
}

class TwoWheeler extends Vehicle {
	TwoWheeler() {
		super(2);
	}
	
	void display() {
		System.out.println("Number of Wheels: 2");
	}
}

class Activa extends TwoWheeler {
	int age;
	String color;
	
	Activa(int age, String color) {
		this.age = age;
		this.color = color;
	}
	
	void display() {
		super.display();
		System.out.println("Age: " + age + " years");
		System.out.println("Color: " + color);
	}
}

class FourWheeler extends Vehicle {
	FourWheeler() {
		super(4);
	}
	
	void display() {
		System.out.println("Number of Wheels: 4");
	}
}

class Jeep extends FourWheeler {
	int age;
	String color;
	
	Jeep(int age, String color) {
		this.age = age;
		this.color = color;
	}
	
	void display() {
		super.display();
		System.out.println("Age: " + age + " years");
		System.out.println("Color: " + color);
	}
}