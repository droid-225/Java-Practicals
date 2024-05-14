package Practical34;
import java.util.ArrayList;
import java.util.Date;

public class Prac34 {
	public static void main(String args[]) {
		ArrayList<Object> list = new ArrayList<>();
		Loan loan = new Loan(12123.33, "Rupees");
		Date date = new Date();
		String str = "Hello!";
		Circle c = new Circle(2, "cm");
		
		list.add(loan);
		list.add(date);
		list.add(str);
		list.add(c);
		
		for(Object o : list) {
			System.out.println(o.toString());
		}
	}
}

class Loan {
	double amount;
	String currency;
	
	Loan(double amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	public String toString() {
		return "Loan Amount = " + amount + " " + currency;
	}
}

class Circle {
	int radius;
	String units;
	
	Circle(int radius, String units) {
		this.radius = radius;
		this.units = units;
	}
	
	public String toString() {
		return ("Radius of Circle: " + radius + " " + units +
				"\nCircumference of Circle: " + (2 * Math.PI * radius) + " " + units +
				"\nArea of Circle: " + (Math.PI * Math.pow(radius, 2)) + " " + units + " squared");
	}
}