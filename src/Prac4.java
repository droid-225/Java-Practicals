import java.util.Scanner;

public class Prac4 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int num;

		System.out.print("Enter a Number: ");
		num = in.nextInt();
		
		if(isPrime(num))
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");
	}

	static boolean isPrime(int num) {
		if(num <= 1)
			return false;
		else {
			for(int i = 2; i < num; i++) {
				if((num % i) == 0) 
					return false; 
			}
		}
		return true;
	}
}
