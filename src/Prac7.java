import java.util.Scanner;

public class Prac7 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String str;
		int len;
		
		System.out.print("Enter a String: ");
		str = in.nextLine();
		
		len = str.length();
		System.out.println("Length of String = " + len);
		
		System.out.print("Second Half of String: ");
		for(int i = (len / 2); i < len; i++) {
			System.out.print(str.charAt(i));
		}		
	}
}
