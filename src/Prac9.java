import java.util.Scanner;

public class Prac9 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String str, rev = "";
		
		System.out.print("Enter a String: ");
		str = in.nextLine();
		
		for(int i = (str.length() - 1); i >= 0; i--) {
			rev += str.charAt(i);
		}
		
		if(str.equals(rev))
			System.out.println(str + " is Palindrome");
		else
			System.out.println(str + " is Not a Palindrome");
	}
}
