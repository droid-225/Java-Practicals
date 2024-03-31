import java.util.Scanner;

public class Prac5 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int a,b,c;
		
		System.out.print("Enter Value of 'a': ");
		a = in.nextInt();
		System.out.print("Enter Value of 'b': ");
		b = in.nextInt();
		System.out.print("Enter Value of 'c': ");
		c = in.nextInt();
		
		if(a > c) {
			if(a > b)
				System.out.println("a = " + a + " is the Greatest Number");
			else
				System.out.println("b = " + b + " is the Greatest Number");
		}
		else {
			if(b > c)
				System.out.println("b = " + b + " is the Greatest Number");
			else
				System.out.println("c = " + c + " is the Greatest Number");	
		}
	}
}
