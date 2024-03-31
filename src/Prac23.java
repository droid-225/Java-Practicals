public class Prac23 {
	public static void main(String args[]) {
		Circle c1 = new Circle(15);
		Circle c2 = new Circle(4.5);
	
		System.out.println("Area of Circle with radius " + (int)c1.radius + " = " + c1.calcAreaInt());
		System.out.println("Area of Circle with radius " + c2.radius + " = " + c2.calcAreaDec());
	}
}

class Circle {
	double radius;
	
	Circle(int radius) {
		this.radius = radius;
	}
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	double calcAreaDec() {
		return 2 * Math.PI * radius;
	}
	
	int calcAreaInt() {
		return (int)(2 * Math.PI * radius);
	}
	
}
