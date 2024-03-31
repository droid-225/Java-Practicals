package Practical28; // Had to put it into its own package since circle class already exists for another practical
//^^^^^^ Do not copy this part ^^^^^^

public class Prac28 {
	public static void main(String args[]) {
		Circle c = new Circle(2);
		Sphere s = new Sphere(3);
		
		System.out.println("For Circle:");
		c.display();
		
		System.out.println("\nFor Sphere:");
		s.display();
	}
}

abstract class Shape {
	abstract void display();
}

interface Shape2D {
	double area();
}

class Circle extends Shape implements Shape2D {
	double radius;
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	void display() {
		System.out.println("Area = " + area());
	}
}

interface Shape3D {
	double volume();
}

class Sphere extends Shape implements Shape3D {
	double radius;
	
	Sphere(double radius) {
		this.radius = radius;
	}
	
	public double volume() {
		return (4 / 3) * Math.PI * Math.pow(radius, 3);
	}
	
	void display() {
		System.out.println("Volume = " + volume());
	}
}