import java.util.Scanner;

public class Prac1 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		float a,b,c,d,e,f,p;
		double x,y;
		
		System.out.println("Enter Values for Equation 1: e = ax + by");
		System.out.println("Enter Value of a: ");
		a = in.nextFloat();
		System.out.println("Enter Value of b: ");
		b = in.nextFloat();
		System.out.println("Enter Value of e: ");
		e = in.nextFloat();
		
		System.out.println("Enter Values for Equation 2: f = cx + dy");
		System.out.println("Enter Value of c: ");
		c = in.nextFloat();
		System.out.println("Enter Value of d: ");
		d = in.nextFloat();
		System.out.println("Enter Value of f: ");
		f = in.nextFloat();
		
		System.out.println("Equations Entered: ");
		System.out.println(e + " = " + a + "x " + b + "y");
		System.out.println(f + " = " + c + "x " + d + "y");
		
		p = ((a*d) - (b*c));
		if(p != 0) {
			System.out.println("Solution: ");
			x = (((e * d) - (b * f) / (a * d) - (b * c)));
			System.out.println("x = " + x);
			y = (((a * f) - (e * c) / (a * d) - (b * c)));
			System.out.println("y = " + y);	
		}
		else
			System.out.println("This equation has no solution!");
	}
}
