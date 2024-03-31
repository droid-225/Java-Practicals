import java.util.Scanner;

public class Prac10 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String str;
		
		System.out.print("Enter a Word: ");
		str = in.next();
		
		for(int i = 0; i < str.length(); i++) {
			for(int j = str.length() - (i + 1); j >= 0; j--) {
				System.out.print(' ');
			}
			for(int j = 0; j <= i; j++) {
				System.out.print(str.charAt(j));
				System.out.print(' ');
			}
			System.out.println();
		}
	}
}
