package Practical34;
import java.util.ArrayList;
import java.util.Date;

public class Prac34 {
	public static void main(String args[]) {
		ArrayList<Object> list = new ArrayList<>();
		Loan loan = new Loan(12123.33, "Rupees");
		Date date = new Date();
		
		
	}
}

class Loan {
	double amount;
	String currency;
	
	Loan(double amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	void display() {
		System.out.println("Loan Amount: " + amount + " " + currency);
	}
}

class Circle {
	int radius;
	String units;
	
	Circle(int radius, String units) {
		this.radius = radius;
		this.units = units;
	}
	
	void display() {
		System.out.println("Radius of Circle: " + radius + " " + units);
		System.out.println("Circumference of Circle: " + (2 * Math.PI * radius) + " " + units);
		System.out.println("Area of Circle: " + (Math.PI * Math.pow(radius, 2)) + " " + units + " squared");
	}
}