import java.util.Scanner;

public class Prac2 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double kg, m, inch, lbs, BMI;
	
		System.out.print("Enter Your Weight in Pounds(lbs): ");
		lbs = in.nextDouble();
		System.out.print("Enter Your Height in Inches: ");
		inch = in.nextDouble();
		
		kg = lbs / 0.45359237f;
		m = inch / 0.0254f;
		
		BMI = kg / Math.sqrt(m);
		System.out.println("Your BMI: " + BMI);
	}
}
