import java.util.Scanner;

public class Prac3 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double m, ft;
	
		System.out.print("Enter A Number in Meters: ");
		m = in.nextDouble();
		
		ft = m * 3.2808399f;
		System.out.println("That Number in Feet = " + ft);
	}
}
