// gcd of two numbers

import java.util.Scanner;

class Prac15 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int a, b, i = 1, gcf = 0;
		
		System.out.print("Enter First Number: ");
		a = in.nextInt();
		System.out.print("Enter Second Number: ");
		b = in.nextInt();
		
		while(true) {
			if (i == a + 1 || i == b + 1) {
				break;
			}
			if(a % i == 0 && b % i == 0) {
				if (i > gcf)
					gcf = i;
			}
			i++;
		}
		
		System.out.println("GCF of " + a + " and " + b + " = " + gcf);
	}
}