import java.util.Scanner;

public class Prac6 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		char c;
		
		System.out.print("Enter an Alphabetical Character: ");
		c = in.next().charAt(0);
		
		switch(c) {
			case 'a':
				System.out.println(c + " is a Vowel");
				break;
			case 'e':
				System.out.println(c + " is a Vowel");
				break;
			case 'i':
				System.out.println(c + " is a Vowel");
				break;
			case 'o':
				System.out.println(c + " is a Vowel");
				break;
			case 'u':
				System.out.println(c + " is a Vowel");
				break;
			default:
				System.out.println(c + " is a Consonant");
				break;
		}
	}
}
