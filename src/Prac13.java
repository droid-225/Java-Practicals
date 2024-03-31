// decimal to fraction

import java.util.Scanner;

public class Prac13 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double decimal;
		String temp, fraction, prePoint = "", postPoint = "";
		boolean afterDecPoint = false;
		int prePointInt, postPointInt, denom;
		
		System.out.println("Enter a decimal value: ");
		decimal = in.nextDouble();
		
		temp = Double.toString(decimal);
		char[] values = temp.toCharArray();
		
		for(char c: values) {
			if(c == '.')
				afterDecPoint = true;
			if(!afterDecPoint)
				prePoint += c;
			else
				if(c != '.')
					postPoint += c;
		}
		
		prePointInt = Integer.valueOf(prePoint);
		postPointInt = Integer.valueOf(postPoint);
		denom = (int)Math.pow(10, postPoint.length());
		
		System.out.println("Fraction: " + ((prePointInt * denom) + postPointInt) + "/" + denom);
	}
}
