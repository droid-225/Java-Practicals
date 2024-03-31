import java.util.*;

class Prac14 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int num, x = 2;
		
		System.out.print("Enter a Positive Number: ");
		num = in.nextInt();
		
		System.out.println("Factors of " + num + ": ");
		while(num != 1) {
			if(num % x == 0) {
				System.out.print(x + " ");
				num /= x;
			}
			else
				x++;
		}
	}
}